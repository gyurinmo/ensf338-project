package src.main.java.mylib.datastructures;

import java.util.EmptyStackException;

import src.main.java.mylib.datastructures.linear.StackLL;

public class StackLLTest {
    public static void main (String[] args) {
        StackLL<Integer> stack = new StackLL<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack after push operations: " + stack.toString());

        System.out.println("Peek the top element: " + stack.peek());

        System.out.println("Pop the top element: " + stack.pop());
        System.out.println("Stack after pop operation: " + stack.toString());

        try {
            stack.pop();

        } catch (EmptyStackException e) {
            System.out.println("Caught an EmptyStackException when trying to pop from an empty stack.");
        }
    }
}

