package Menge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MengeTest {

	Menge<Integer> test1;
	Menge<Integer> test2;

	@BeforeEach
	void init() {
		test1 = new MengeLimited<Integer>();
		test2 = new MengeLimited<Integer>();
		test1.insert(1);
		test1.insert(2);
		test2.insert(2);
		test2.insert(3);
	}

	@Test
	void insertTest1() {
		// Teste das Einfügen von Elementen in die Menge
		test1.insert(3);
		assertEquals(3, test1.size()); // Überprüfe die Größe der Menge nach dem Einfügen
		test1.delete(1);
		test1.delete(2);
		test1.delete(3);
		assertFalse(test1.contains(3));
		assertEquals(0, test1.size());
		assertThrows(NoSuchElementException.class, () -> test1.get());
	}

	@Test
	void MergeTest() {
		MengeUtil.merge(test1, test2);
		assertEquals(3, test1.size());
	}

	@Test
	void testDelete() {

		test1.delete(2);
		test2.delete(3);
		assertFalse(test1.contains(2));
		assertTrue(test1.size() == test2.size());
		assertEquals(1, test1.size()); // Überprüfe die Größe der Menge nach dem Löschen
		test1.delete(1);
		assertThrows(NoSuchElementException.class, () -> test1.get());
	}
}
