package Arche;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorUniTest {

	
	private IterierbareArche<Tier> archeIter;

	@BeforeEach
	void setUp() {
		archeIter.insert(new Igel("Igel", 3));
		archeIter.insert(new Hase("Hase", 5));
		archeIter.insert(new Amsel("Amsel", 7));

	}

	
	@Test
	public void testSizeAfterInsertion() {
		assertEquals(3, archeIter.getSize());
	}
}
