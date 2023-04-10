package src.main.java.mylib.datastructures.linear;

import static org.junit.Assert.*;

import java.beans.Transient;

import javax.management.RuntimeErrorException;
import org.junit.Test;
import src.main.java.mylib.datastructures.linear.StackLL;

public class StackLLTest {

    @Test
    public void testPushPop() {
        StackLL<Integer> stack = new StackLL<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
    }

    @Test
    public void testPeek() {
        StackLL<String> stack = new StackLL<>();
        stack.push("first");
        stack.push("second");
        assertEquals("second", stack.peek());
        assertEquals("second", stack.peek());
    }

    @Test(expected = RuntimeErrorException.class)
    public void testPopEmptyStack() {
        StackLL<Double> stack = new StackLL<>();
        stack.pop();
    }

    @Test(expected = RuntimeErrorException.class)
    public void testPeekEmptyStack() {
        StackLL<Character> stack = new StackLL<>();
        stack.peek();
    }
}