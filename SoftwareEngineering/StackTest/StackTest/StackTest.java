package StackTest;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private static final int MAX_SIZE = 4;

    static class EigeneStack<T> extends Stack<T> {
        @Override
        public T push(T item) {
            if (size() >= MAX_SIZE) {
                throw new IndexOutOfBoundsException("Stack ist voll");
            }
            return super.push(item);
        }
    }

    @Test
    void stackZustaendeTest() {
        EigeneStack<Integer> stack = new EigeneStack<>();

        // Test 1 Zustand "empty"
        assertTrue(stack.empty(), "Stack sollte leer sein");

        // Test 2 Zustand "filled"
        stack.push(1);
        assertEquals(1, stack.size(), "Die Größe des Stacks sollte 1 sein nach einem push");
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size(), "Die Größe des Stacks sollte 3 sein nach drei pushes");
        assertFalse(stack.empty(), "Stack sollte nicht leer sein");

        // Test 3 Zustand "full"
        stack.push(4); // Jetzt sollte der Stack voll sein
        assertEquals(4, stack.size(), "Stack sollte die Größe 4 haben wenn es voll ist");
        assertThrows(IndexOutOfBoundsException.class, () -> stack.push(5), "Weitere Elemente lösen eine Exception aus");

        // Test 4 Zustand nach "pop"
        stack.pop();
        assertEquals(3, stack.size(), "Stacks Größe sollte 3 sein nach einem pop");
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.empty(), "Stack sollte wieder leer sein nachdem alle Elemente gelöscht wurden");
    }
}
