package TelmanKlausur;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZFTest {

	@Test
	public void test() {
		ZF zf1 = new ZF();
		ZF zf2 = new ZF();
		zf1.extend(0); // test extend NOTHING
		assertEquals(0, zf1.size);
		zf1.extend(-1); // test extend NEGATIVE
		assertEquals(0, zf1.size);
		zf1.extend(1); // test NORMAL extend
		assertEquals(1, zf1.size);
		zf1.removeLast(); // test extend after removeLast
		zf1.extend(2);
		assertEquals(2, zf1.size);
		zf1.extend(3); // test equality of two extends
		zf2.extend(5);
		for (int i = 0; i < 5; i++) {
			assertEquals(zf1.get(i), zf2.get(i));
		}
	}
}
