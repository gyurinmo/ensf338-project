package src.main.java.mylib.datastructures;

import src.main.java.mylib.datastructures.linear.SLL;
import src.main.java.mylib.datastructures.linear.StackLL;

import org.junit.Before;
import org.junit.Test;

import java.beans.Transient;
import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackLLTest {

    private StackLL<Integer> stack;

    @Before 
    public void setUp() {
        stack = new Stack<>();

    }

    @Test 
    public void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
    }

    @Test 
    public void testPeek() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(Integer.valueOf(3), stack.peek());
        assertEquals(Integer.valueOf(3), stack.peek()); 
    }

    @Test(expected = EMptyStackException.class)
    public void testPopEmptyStack() {
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekEmptyStack() {
        stack.peek();
    }
}
