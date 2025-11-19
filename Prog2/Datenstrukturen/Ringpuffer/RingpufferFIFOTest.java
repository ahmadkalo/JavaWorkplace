package Ringpuffer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RingpufferFIFOTest {
	
	Ringpuffer<Integer> rp;
	
	private Ringpuffer<Integer> intRingpuffer;

	@BeforeEach
	void setUp() {
		intRingpuffer = new RingpufferFIFO<Integer>(3);
	}
	
	@Test
	void testNegativeList() {
		assertThrows(IllegalArgumentException.class, ()->{
			intRingpuffer = new RingpufferFIFO<Integer>(-2);
		});
	}
	
	@Test
	void testAddLastAndFront() {
		intRingpuffer.add(1);
		assertEquals(1, intRingpuffer.get());

		intRingpuffer.add(2);
		assertEquals(1, intRingpuffer.get());
		
		intRingpuffer.add(3);
		assertEquals(1, intRingpuffer.get());
	}

	@Test
	void testRemoveFirst() {
		intRingpuffer.add(1);
		intRingpuffer.add(2);
		intRingpuffer.add(3);

		intRingpuffer.remove();
		assertEquals(2, intRingpuffer.get());

		intRingpuffer.remove();
		assertEquals(3, intRingpuffer.get());

	}

	@Test
	void testRemoveFirstEmpty() {
		assertThrows(NoSuchElementException.class, () -> {
			intRingpuffer.get();
		});
	}

	@Test
	void testContains() {
		intRingpuffer.add(1);
		intRingpuffer.add(2);
		intRingpuffer.add(3);

		assertTrue(intRingpuffer.contains(1));
		assertTrue(intRingpuffer.contains(2));
		assertTrue(intRingpuffer.contains(3));
		assertFalse(intRingpuffer.contains(4));
	}
	
	@Test
	void testUeberlauf() {
		intRingpuffer.add(1);
		intRingpuffer.add(2);
		intRingpuffer.add(3);
		assertThrows(IllegalStateException.class, ()->{
			intRingpuffer.add(4);	
		});
	}
	
	@Test
	void testLeeren() {
		intRingpuffer.add(1);
		intRingpuffer.add(2);
		intRingpuffer.add(3);
		intRingpuffer.remove();
		intRingpuffer.remove();
		intRingpuffer.remove();
		assertThrows(NoSuchElementException.class, ()->{
			intRingpuffer.get();
		});
	}
	
	
	@Test
    public void testIterator() {
        Iterator<Integer> iterator = intRingpuffer.iterator();
		intRingpuffer.add(1);
		intRingpuffer.add(2);
		intRingpuffer.add(3);
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }
	
	@Test
	public void testIntegration() {
		intRingpuffer.add(1);
		intRingpuffer.add(2);
		assertEquals(2, intRingpuffer.size());
		assertEquals(1, intRingpuffer.get());
		intRingpuffer.remove();
		assertEquals(1, intRingpuffer.size());
		assertEquals(2, intRingpuffer.get());
		intRingpuffer.add(3);
		assertEquals(2, intRingpuffer.size());
		assertEquals(2, intRingpuffer.get());
		intRingpuffer.remove();
		assertEquals(1, intRingpuffer.size());
		assertEquals(3, intRingpuffer.get());
		intRingpuffer.add(4);
		intRingpuffer.add(5);
		assertEquals(3, intRingpuffer.size());
		assertEquals(3, intRingpuffer.get());
	}
    
}