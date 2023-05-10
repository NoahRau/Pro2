package Lektion16.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackVererbungTest {

    private Stack<String> stack;

    @BeforeEach
    void setUp()  {
        stack = new StackVererbung<>();
    }

    @Test
    void testPushAndPop() {
        stack.push("a");
        stack.push("b");
        stack.push("c");

        assertEquals("c", stack.pop());
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());

        stack.push("a");

        assertFalse(stack.isEmpty());

        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testSize() {
        assertEquals(0, stack.size());

        stack.push("a");

        assertEquals(1, stack.size());

        stack.push("b");
        stack.push("c");

        assertEquals(3, stack.size());

        stack.pop();

        assertEquals(2, stack.size());
    }


}