package Person;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPerson {

	static Stud anna = new Stud("Anna", 1999);
	static Stud ben = new Stud("Ben", 2002);
	static Boxer david = new Boxer("David", 2002, 88.5);
	static Stud ahmed = new Stud("Ahmed", 1999);
	static Boxer telman = new Boxer("Telman", 2002, 100.1);

	 Person person1;
	 Person person2;
	 Person person3;
	 Person person4;
	 Person person5;

	@BeforeEach
	void init() {
		person1 = (Person) anna; // upcating
		person2 = (Person) ben;
		person3 = (Person) david;
		person4 = (Person) ahmed;
		person5 = (Person) telman;
	}

	@Test
	void testMatNummern() {
		assertEquals(100, anna.getMatrikel());
		assertEquals(101, ben.getMatrikel());
		assertEquals(102, ahmed.getMatrikel());
	}

	@Test
	void testGewicht() {
		assertEquals(88.5, david.getGewicht());
		david.setGewicht(98.5);
		assertEquals(98.5, david.getGewicht());
	}

	@Test
	void testClassCastException() {
		assertThrows(ClassCastException.class, () -> david = (Boxer) person1);  
		// eine Unterklasse kann man upcasten geht
		// eine Oberklasse zu einer Unterklasse downcasten (ClassCastException) geht nicht
	} 

	@Test
	void testEquals() {

		/* reflexive */

		assertTrue(anna.equals(anna));
		assertTrue(ben.equals(ben));
		assertTrue(david.equals(david));
		assertTrue(ahmed.equals(ahmed));
		assertTrue(telman.equals(telman));

		assertTrue(person1.equals(person1));
		assertTrue(person2.equals(person2));
		assertTrue(person3.equals(person3));
		assertTrue(person4.equals(person4));
		assertTrue(person5.equals(person5));

		/* symmetric */

		assertTrue(anna.equals(person1) && person1.equals(anna));
		assertTrue(ben.equals(person2) && person2.equals(ben));
		assertTrue(david.equals(person3) && person3.equals(david));
		assertTrue(ahmed.equals(person4) && person4.equals(ahmed));
		assertTrue(telman.equals(person5) && person5.equals(telman));

		/* transitive */

		Object object1 = (Object) anna; // upcast
		Object object2 = (Object) ben;  // upcast
		Object object3 = (Object) david; // upcast
		Object object4 = (Object) ahmed; // upcast
		Object object5 = (Object) telman; // upcast

		assertTrue(anna.equals(person1) && person1.equals(object1) && anna.equals(object1));
		assertTrue(ben.equals(person2) && person2.equals(object2) && ben.equals(object2));
		assertTrue(david.equals(person3) && person3.equals(object3) && david.equals(object3));
		assertTrue(ahmed.equals(person4) && person4.equals(object4) && ahmed.equals(object4));
		assertTrue(telman.equals(object5) && object5.equals(object5) && telman.equals(object5));

		/** consistent */

		assertTrue(anna.equals(person1));
		assertTrue(ben.equals(person2));
		assertTrue(david.equals(person3));
		assertTrue(ahmed.equals(person4));
		assertTrue(telman.equals(object5));

		/* non-null */

		assertFalse(anna.equals(null));
		assertFalse(ben.equals(null));
		assertFalse(david.equals(null));
		assertFalse(ahmed.equals(null));
		assertFalse(telman.equals(null));

		assertFalse(person1.equals(null));
		assertFalse(person2.equals(null));
		assertFalse(person3.equals(null));
		assertFalse(person4.equals(null));
		assertFalse(object5.equals(null));
	}

}
