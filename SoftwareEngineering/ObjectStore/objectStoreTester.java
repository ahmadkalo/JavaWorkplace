import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class objectStoreTester {

    private ObjectStore store1 = null;
    private ObjectStore store2 = null;
    private ObjectStore store3 = null;

    @BeforeEach
    protected void setUp() throws Exception {
        store1 = new ObjectStore();
        ObjectStore store2 = new ObjectStore();
        store3 = store1;
        store2 = store3;
    }

    @Test
    public void testIdentity() {
        assertNotSame(store1, store2);
        assertSame(store1, store3);
        assertNotSame(store2, store3);

        assertNotSame(store2, store1);
        assertNotSame(store2, store3);
        assertNotSame(store3, store2);
        assertSame(store3, store1);

    }

    @Test
    public void testEquals() {
        ObjectStore store4 = new ObjectStore();
        store1.addTObject(new TObject("01"));
        store1.addTObject(new TObject("02"));
        store4.addTObject(new TObject("03"));
        store3.addTObject(new TObject("04"));

        assertTrue(store1.equals(store1));
        assertFalse(store1.equals(store4));
        assertTrue(store1.equals(store3));
        assertTrue(store3.equals(store1));
        assertFalse(store3.equals(store4));
        assertTrue(store3.equals(store3));
        assertFalse(store4.equals(store1));
        assertFalse(store4.equals(store3));
        assertTrue(store4.equals(store4));
    }

    @Test
    public void testToString() {
        ObjectStore store4 = new ObjectStore();

        store1.addTObject(new TObject("012"));
        store1.addTObject(new TObject("023"));
        store4.addTObject(new TObject("abc"));
        store3.addTObject(new TObject("xyz"));
        assertEquals(store1.toString(), "012023xyz");
        assertEquals(store3.toString(), "012023xyz");
        assertEquals(store4.toString(), "abc");
    }
}

