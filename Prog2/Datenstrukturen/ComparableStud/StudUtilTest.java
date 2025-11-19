package ComparableStud;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Menge.Menge;
import Menge.MengeDynArray;


class StudUtilTest {

	private Stud a;
	private Stud b; 
	private Stud c;
	private Stud d;
	
	@BeforeEach
	void setUp() {
		 a = new Stud("Anna");
		 b = new Stud("Benjamin");
		 c = new Stud("Carlos");
		 d = new Stud("Dora");
	}

	@Test
	void testOrdered() {
		Menge <Stud> m = new MengeDynArray<Stud>();
		m.insert(c);
		m.insert(d);
		m.insert(a);
		m.insert(b);
		Stud[] arr = StudUtil.sort(m);
		assertTrue(testOrder(arr));
	}
	
	
	@Test
	void testUnordered() {
		Menge <Stud> m = new MengeDynArray<Stud>();
		m.insert(a);
		m.insert(d);
		m.insert(c);
		m.insert(b);
		Stud[] arr = StudUtil.sort(m);
		assertTrue(testOrder(arr));
	}
	
	@Test
	void testReverse() {
		Menge <Stud> m = new MengeDynArray<Stud>();
		m.insert(d);
		m.insert(c);
		m.insert(b);
		m.insert(a);
		Stud[] arr = StudUtil.sort(m);
		assertTrue(testOrder(arr));
	}
	
	
	boolean testOrder(Stud[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			if((arr[i].compareTo(arr[i+1]) > 0)) {
				return false;
			}
		}
		return true;
	}

}
