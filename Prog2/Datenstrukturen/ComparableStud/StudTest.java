package ComparableStud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudTest {
	
	private Stud ahmed;
	private Stud delyar;
	
	
	 @BeforeEach
	public void test() {
		 ahmed = new Stud("Ahmed");
		 delyar = new Stud("Delyar");
		
	}
	@Test
	public void testeMatNr() {
		assertEquals(-1,ahmed.compareTo(delyar));
        assertTrue(ahmed.compareTo(delyar) < 0);
        assertFalse(ahmed.compareTo(delyar) >= 0);
		
	}

}
