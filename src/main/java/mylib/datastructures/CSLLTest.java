package src.main.java.mylib.datastructures;

import org.junit.Test;
import src.main.java.mylib.datastructures.linear.CSLL;
import src.main.java.mylib.datastructures.nodes.SNode;

import static org.junit.Assert.*;

public class CSLLTest {

    @Test
    public void testInsertTail() {
        CSLL<Integer> csll = new CSLL<>();
        csll.insertTail(new SNode<>(1));
        csll.insertTail(new SNode<>(2));
        csll.insertTail(new SNode<>(3));
        assertEquals(3, csll.getSize());
        assertEquals(Integer.valueOf(1), csll.getHead().getData());
        assertEquals(Integer.valueOf(3), csll.getHead().getData());

    }

    @Test
    public void testDeleteHead() {
        CSLL<Integer> csll = new CSLL<>();
        csll.insertTail(new SNode<>(1));
        csll.insertTail(new SNode<>(2));
        csll.insertTail(new SNode<>(3));
        csll.deleteHead();
        assertEquals(2, csll.getSize());
        assertEquals(Integer.valueOf(2), csll.getHead().getData());
        assertEquals(Integer.valueOf(3), csll.getHead().getData());
    }

    @Test
    public void testDeleteTail() {
        CSLL<Integer> csll = new CSLL<>();
        csll.insertTail(new SNode<>(1));
        csll.insertTail(new SNode<>(2));
        csll.insertTail(new SNode<>(3));
        csll.deleteTail();
        assertEquals(2, csll.getSize());
        assertEquals(Integer.valueOf(1), csll.getHead().getData());
        assertEquals(Integer.valueOf(2), csll.getHead().getData());

    }

    @Test
    public void testDelete() {
        CSLL<Integer> csll = new CSLL<>();
        SNode<Integer> node1 = new SNode<>(1);
        SNode<Integer> node2 = new SNode<>(2);
        SNode<Integer> node3 = new SNode<>(3);
        csll.insertTail(node1);
        csll.insertTail(node2);
        csll.insertTail(node3);
        csll.delete(node2);
        assertEquals(2, csll.getSize());
        assertEquals(node1, csll.getHead());
        assertEquals(node3, csll.getTail());

    }
}
