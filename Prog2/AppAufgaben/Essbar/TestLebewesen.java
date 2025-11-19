package Essbar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestLebewesen {

	// unit under test
	private Lebewesen uut;

	@BeforeEach   // diese Methode wird vor jedem Test aufgerufen
	void init() {
		uut = new Katze();
	}

	@Test
	void testLeben() {

		// Arrange
		Hund h = new Hund(3, "Entspannt");

		// Act
		h.essen(uut);

		// Assert
		assertEquals(6, uut.getLeben());
	}


	@Test
	void testGameOver() {
		assertThrows(GameOverException.class, () -> {
			Hund h = new Hund(3, "Entspannt");
			for (int i = 0; i < 7; i++) {
				h.essen(uut);
			}
		});
	}
}
