package src.main.java.mylib.datastructures;

import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

import src.main.java.mylib.datastructures.linear.QueueLL;
import src.main.java.mylib.datastructures.nodes.SNode;

public class QueueLLTest {

    @Test
    public void testEnqueueAndDequeue() {
        QueueLL<String> queue = new QueueLL<>();

        queue.enqueue(new SNode<>("A"));
        queue.enqueue(new SNode<>("B"));
        queue.enqueue(new SNode<>("C"));

        assertEquals("A", queue.getHead().getData());
        assertEquals("B", queue.getHead().getNext().getData());
        assertEquals("C", queue.getTail().getData());

        SNode<String> dequeuedNode = queue.dequeue();
        assertEquals("A", dequeuedNode.getData());

        assertEquals("B", queue.getHead().getData());

        dequeuedNode = queue.dequeue();
        assertEquals("B", dequeuedNode.getData());
        dequeuedNode = queue.dequeue();
        assertEquals("C", dequeuedNode.getData());

        assertNull(queue.getHead());
        assertNull(queue.getTail());

    }

    @Test
    public void testInsertHead() {
        QueueLL<String> queue = new QueueLL<>();

        try {
            queue.insertHead(new SNode<>("A"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {

        }
    }

    @Test
    public void testSortedInsert() {
        QueueLL<String> queue = new QueueLL<>();

        try {
            queue.sortedInsert(new SNode<>("A"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {

        }
    }
}
