package ComperatorPerson;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    /* Instanzvariablen */

    private Person p1;
    private Person p2;

    /* Instanzmethoden */

    @BeforeEach
    public void setUp() {
        p1 = new Person("John", 39);
        p2 = new Person("Jane", 43);
    }

    @Test
    public void test() {
        assertTrue(p1.compareTo(p2) < 0);
    }
    
}
