package Roboter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FahrzeugTest {
	
	static Beweglich b;
	static IntPunkt2D p;
	static IntPunkt2D nullpunkt = new IntPunkt2D();


	@BeforeEach
	void init() {
		b = new Fahrzeug();
		p = new IntPunkt2D(2, -1);
	}
	
	@Test
	void testInit() {
		assertEquals(nullpunkt, b.position());
	}
	
	@Test
	void testMoveTo() {
		b.moveTo(p);
		assertEquals(p, b.position());
	}
}
