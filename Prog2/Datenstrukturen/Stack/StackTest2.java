package Stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest2 {
    private StackEVL<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new StackEVL<>();
    }

    @Test
    void testPushNotEmpty() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testPushTop() {
        stack.push(1);
        assertEquals(1, stack.top());
    }

    @Test
    void testPushPopTop() {
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertEquals(1, stack.top());
    }
}


