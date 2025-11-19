package PersonSolvenz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CheckPersonTest {

    @Test
    void testNegativeAge() {
        CheckPerson checkPerson = new CheckPerson();
        Person person = new Person("Eren", -1);

        assertThrows(ArithmeticException.class, () -> checkPerson.checkSolvency(person), 
                "Negatives Alter verursacht ein Exception");
    }

    @Test
    void testZeroAge() {
        CheckPerson checkPerson = new CheckPerson();
        Person person = new Person("Ahmed",0);
        assertThrows(ArithmeticException.class, () -> checkPerson.checkSolvency(person),
                "Alter 0 verursacht ein Exception");
    }

    @Test
    void testAgeBetween1And17() {
        CheckPerson checkPerson = new CheckPerson();
        Person person = new Person("Mayer",10);
        assertEquals(0, checkPerson.checkSolvency(person),
                "Alter zwischen 1 und 17 liefert Solvenzstufe 0");
    }

    @Test
    void testAgeBetween18And64() {
        CheckPerson checkPerson = new CheckPerson();
        Person person = new Person("Delyar", 30);
        assertEquals(1, checkPerson.checkSolvency(person), 
                "Alter zwischen 18 und 64 liefert Solvenzstufe 1");
    }

    @Test
    void testAge65AndAbove() {
        CheckPerson checkPerson = new CheckPerson();
        Person person = new Person("Lava", 70);
        assertEquals(2, checkPerson.checkSolvency(person), 
                "Alter 65 und darüber liefert Solvenzstufe 2");
    }
}
