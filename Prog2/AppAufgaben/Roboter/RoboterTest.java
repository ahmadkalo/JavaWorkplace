package Roboter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RoboterTest {
	
	static Beweglich b;
	static Roboter r;
	static IntPunkt2D p;
	static IntPunkt2D nullpunkt = new IntPunkt2D();


	@BeforeEach
	void init() {
		p = new IntPunkt2D(2, 1);
		b = new Roboter();
		r = new Roboter(p, 3);
	}
	
	@Test
	void testInit() {
		assertEquals(nullpunkt, b.position());
		assertEquals(p, r.position());
		assertEquals(3, r.richtung());
	}
	
	@Test
	void testMoveTo() {
		b.moveTo(p);
		assertEquals(p, b.position());
	}
	
	@Test
	void testException() {
		assertThrows (IllegalArgumentException.class, () -> {new Roboter(p, -2);});
		assertThrows (IllegalArgumentException.class, () -> {r.turn(-1);});
	}
	
	
}
