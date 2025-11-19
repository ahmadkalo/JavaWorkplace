package EvlSchlange;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchlangeAlsEVLTest {
	SchlangeAlsEVL<Integer> schlange;

	@BeforeEach
	void setUp() {
		schlange = new SchlangeAlsEVL<Integer>(); // erzeuge neue (leere) Schlange vor jedem Test
	}

	@Test
	void testSizeOfEmptyList() { // prüft, ob für eine leere Schlange die korrekte Länge zurückgegeben wird;
		assertEquals(0, schlange.size());
	}

	@Test
	void testSizeAfterInsert() { // prüft, ob nach dem Einfügen die korrekte Länge zurückgegeben wird;
		schlange.insert(5);
		assertEquals(1, schlange.size());
	}

	@Test
	void testSizeAfterRemove() { // prüft, ob nach dem Entfernen die korrekte Länge zurückgegeben wird;
		schlange.insert(5);
		schlange.remove();
		assertEquals(0, schlange.size());
	}
}
