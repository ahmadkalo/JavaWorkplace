package DynArray;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DynArrayJunit {

	static DynArray<Integer> array1 = new DynArray<Integer>();
	static DynArray<Integer> array2 = new DynArray<Integer>();
	static DynArray<Integer> array3 = new DynArray<Integer>();

	@BeforeEach
	void init() {
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array2.add(4);
		array2.add(5);
		array2.add(6);

		array3.add(7);
		array3.add(8);
		array3.add(9);
	}

	@Test
	void testMatNummern() {

		assertEquals(3, array1.size());
		array1.delete(1);
		assertEquals(2, array1.size());
	
	}

}
