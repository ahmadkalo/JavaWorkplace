package EVL;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EVLTest {

    static EVL<Integer> liste1;
    static EVL<String> liste2;
    static EVL<Integer> leer1;

    @BeforeEach
    void init() {
        liste1 = new EVL<Integer>();
        for (int i = 1; i <= 5; i++) {
            liste1.insert(10 + i);
        }


        leer1 = new EVL<Integer>();

        liste2 = new EVL<String>();
        liste2.insert("eins");
        liste2.insert("zwei");
        liste2.insert("drei");

    }

    @Test
    void testEmpty() {
        testEmpty(leer1);
    }

    static <T> void testEmpty(EVL<T> liste) {
        assertTrue(liste.isEmpty());
        assertEquals(0, liste.size());
        assertThrows(NoSuchElementException.class, () -> {
            liste.getFirst();
        });
    }

    @Test
    void testInit() {
        assertFalse(liste1.isEmpty());
        assertEquals(5, liste1.size());
        assertEquals(15, liste1.getFirst());

        System.out.println(liste1.toString());
        assertFalse(liste2.isEmpty());
        assertEquals(3, liste2.size());
        assertEquals("drei", liste2.getFirst());
        System.out.println(liste2.toString());
    }


    @Test
    void testInsertListe1() {
        assertEquals(15, liste1.getFirst());
        liste1.insert(9);
        assertEquals(9, liste1.getFirst());
    }

    @Test
    void testInsertListe2() {
        assertEquals("drei", liste2.getFirst());
        liste2.insert("vier");
        assertEquals("vier", liste2.getFirst());
    }


    @Test
    void testRemoveListe1() {
        liste1.removeFirst();
        assertEquals(14, liste1.getFirst());
        assertEquals(4, liste1.size());
        liste1.insert(16);
        assertEquals(16, liste1.getFirst());
        // removeAll
        while (!liste1.isEmpty())
            liste1.removeFirst();
        assertTrue(liste1.isEmpty());
        assertEquals(0, liste1.size());
        assertThrows(NoSuchElementException.class, () -> {
            liste1.getFirst();
        });
    }

    @Test
    void testRemoveListe2() {
        liste2.removeFirst();
        assertEquals("zwei", liste2.getFirst());
        liste2.insert("vier");
        assertEquals("eins", liste2.getLast());
        // removeAll
        while (!liste2.isEmpty())
            liste2.removeFirst();
        assertTrue(liste2.isEmpty());
        assertEquals(0, liste2.size());
        assertThrows(NoSuchElementException.class, () -> {
            liste2.getFirst();
        });
    }

    @Test
    void testContains() {
        assertFalse(leer1.contains(6));
        assertFalse(liste1.contains(6));
        assertTrue(liste1.contains(11));
        assertTrue(liste1.contains(15));

    }

}