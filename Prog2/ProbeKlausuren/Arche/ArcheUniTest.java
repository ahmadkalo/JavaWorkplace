package Arche;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;


public class ArcheUniTest {

	Arche<String> arche = new Arche<String>();
	private IterierbareArche<Tier> archeIter;

	@BeforeEach
	void setUp() {
		archeIter.insert(new Amsel("Amsel",3));
		archeIter.insert(new Hase("Hase", 4));
		archeIter.insert(new Hase("Hase", 6));

	}

	@Test
	void testIter() {
		Tier[] tiere = { new Hase("Hase",3), new Amsel("Amsel",2), new Igel("Igel", 3) };
		int index = 0;
		for (Tier t : tiere) {
			assertEquals(tiere[index], t);
			index++;
		}
	}
	@Test
	public void testSizeAfterInsertion() {
		assertEquals(3, archeIter.getSize());
	}

	@Test
	void TestInsert() {
		arche.insert("Ahmed");
		arche.insert("Telman");
		arche.insert("Mayar");

		assertEquals(3, arche.getSize());
		assertEquals(4, arche.getCapacity());
		assertTrue(arche.contains("Mayar"));
	}

	@Test
	void Testremove() {

		assertThrows(NoSuchElementException.class, () -> {
			arche.remove();
		});
	}

}
