package src.main.java.mylib.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.mylib.datastructures.linear.CDLL;
import src.main.java.mylib.datastructures.nodes.DNode;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class CDLLTest {
    private CDLL<Integer> cdll;

    @BeforeEach
    void setUp() {
        cdll = new CDLL<>();
    }

    @Test
    void testInsertHead() {
        DNode<Integer> node = new DNode<>(1);
        cdll.insertHead(node);
        assertEquals(node, cdll.getHead());
    }

    @Test
    void testInsertTail() {
        DNode<Integer> node = new DNode<>(1);
        cdll.insertTail(node);
        assertEquals(node, cdll.getTail());
    }

    @Test
    void testInsert() {
        DNode<Integer> node = new DNode<>(1);
        cdll.insert(node, 0);
        assertEquals(node, cdll.getHead());
    }

    @Test
    void testDeleteHead() {
        DNode<Integer> node = new DNode<>(1);
        cdll.insertHead(node);
        cdll.deleteHead();
        assertNull(cdll.getHead());
        assertNull(cdll.getTail());
    }

    @Test
    void testDeleteTail() {
        DNode<Integer> node = new DNode<>(1);
        cdll.insertHead(node);
        cdll.deleteTail();
        assertNull(cdll.getHead());
        assertNull(cdll.getTail());
    }

    @Test
    void testDelete() {
        DNode<Integer> node1 = new DNode<>(1);
        DNode<Integer> node2 = new DNode<>(2);
        cdll.insertHead(node1);
        cdll.insertTail(node2);
        cdll.delete(node1);
        assertEquals(node2, cdll.getHead());
    }
}
