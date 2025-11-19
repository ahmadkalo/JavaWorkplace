package EvlSchlange;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EVLTest {
	EVL<Integer> evl;

	@BeforeEach
	void setUp() {
		// Initialisierung
		evl = new EVL<>();
	}

	@Test
	void testGetBeyondEndOfList() {
		// Exception Test
		evl.insert(1);
		assertThrows(IndexOutOfBoundsException.class, () -> evl.get(1));
	}
	
	 @Test
	 void testApped() {
		 evl.append(1);
		 evl.append(2);
		 
		 assertEquals(2, evl.get(1));
	 }
	 
	 @Test
	 void testRemove() {
		 evl.append(1);
		 evl.append(2);
		 evl.append(3);
		 
		 evl.remove(2);
		 
		 assertThrows(IndexOutOfBoundsException.class, () -> evl.get(3));
	 }
}
