package Menge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MengeEVLTest {

	static MengeEVL<Integer> liste1;
	static MengeEVL<String> liste2;
	static MengeEVL<Integer> leer1;

	@BeforeEach
	void init() {
		liste1 = new MengeEVL<>();
		for (int i = 1; i <= 5; i++) {
			liste1.insert(10 + i);
		}

		leer1 = new MengeEVL<>();

		liste2 = new MengeEVL<>();
		liste2.insert("eins");
		liste2.insert("zwei");
		liste2.insert("drei");

	}

	@Test
	void testInsertListe1() {
		assertEquals(15, liste1.get());
		liste1.insert(9);
		assertEquals(9, liste1.get());
	}

	@Test
	void testInsertListe2() {
		assertEquals("drei", liste2.get());
		liste2.insert("vier");
		assertEquals("vier", liste2.get());
	}

}
