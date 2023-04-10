package src.main.java.mylib.datastructures;

import org.junit.Test;
import static org.junit.Assert.*;

import src.main.java.mylib.datastructures.nodes.DNode;

public class DLLTest {

    @Test
    public void testInsertedHead() {
        DLL<Integer> list = new DLL<>();
        DNode<Integer> node = new DNode<>(1);
        list.insertHead(node);
        assertEquals(list.head, node);
        assertEquals(list.tail, node);
        assertEquals(list.size, 1);
    }

    @Test
    public void testInsertTail() {
        DLL<Integer> list = new DLL<>();
        DNode<Integer> node = new DNode<>(1);
        list.insertTail(node);
        assertEquals(list.head, node);
        assertEquals(list.tail, node);
        assertEquals(list.size, 1);
    }

    @Test
    public void testInsert() {
        DLL<Integer> list = new DLL<>();
        DNode<Integer> node1 = new DNode<>(1);
        DNode<Integer> node2 = new DNode<>(2);
        DNode<Integer> node3 = new DNode<>(3);
        list.insertTail(node1);
        list.insertTail(node3);
        list.insert(node2, 1);
        assertEquals(list.head.getNext(), node2);
        assertEquals(list.tail.getPrev(), node2);
        assertEquals(list.size, 3);
    }

    @Test
    public void testSortedInsert() {
        DLL<Integer> list = new DLL<>();
        DNode<Integer> node1 = new DNode<>(1);
        DNode<Integer> node2 = new DNode<>(2);
        DNode<Integer> node3 = new DNode<>(3);
        DNode<Integer> node4 = new DNode<>(4);
        list.sortedInsert(node3);
        list.sortedInsert(node1);
        list.sortedInsert(node4);
        list.sortedInsert(node2);
        assertEquals(list.head.getData(), Integer.valueOf(1));
        assertEquals(list.tail.getData(), Integer.valueOf(4));
        assertEquals(list.size, 4);
    }

    @Test
    public void testSearch() {
        DLL<Integer> list = new DLL<>();
        DNode<Integer> node1 = new DNode<>(1);
        DNode<Integer> node2 = new DNode<>(2);
        DNode<Integer> node3 = new DNode<>(3);
        list.insertTail(node1);
        list.insertTail(node2);
        list.insertTail(node3);
        DNode<Integer> result = list.search(node2);
        assertEquals(result, node2);
    }

    @Test
    public void testDeleteHead() {
        DLL<Integer> list = new DLL<>();
        DNode<Integer> node1 = new DNode<>(1);
        DNode<Integer> node2 = new DNode<>(2);
        DNode<Integer> node3 = new DNode<>(3);
        list.insertTail(node1);
        list.insertTail(node2);
        list.insertTail(node3);
        list.deleteHead();
        assertEquals(list.head.getData(), Integer.valueOf(2));
        assertEquals(list.tail.getData(), Integer.valueOf(3));
        assertEquals(list.size, 2);

    }

    @Test
    public void testDeleteTail() {
        DLL<Integer> list = new DLL<>();
        list.insertTail(new DNode<>(1));
        list.insertTail(new DNode<>(2));
        list.insertTail(new DNode<>(3));
        list.deleteTail();
        assertEquals(2, list.tail.getData().intValue());
    }

    @Test
    public void testDelete() {
        DLL<Integer> list = new DLL<>();
        DNode<Integer> node1 = new DNode<>(1);
        DNode<Integer> node2 = new DNode<>(2);
        DNode<Integer> node3 = new DNode<>(3);
        list.insertTail(node1);
        list.insertTail(node2);
        list.insertTail(node3);
        list.delete(node2);
        assertEquals(node3, list.tail);
        assertEquals(node1, list.head);
    }

    @Test
    public void testSort() {
        DLL<Integer> list = new DLL<>();
        list.insertTail(new DNode<>(3));
        list.insertTail(new DNode<>(1));
        list.insertTail(new DNode<>(2));
        list.sort();
        assertEquals(1, list.head.getData().intValue());
        assertEquals(2, list.head.getNext().getData().intValue());
        assertEquals(3, list.tail.getData().intValue());
    }

    @Test
    public void testClear() {
        DLL<Integer> list = new DLL<>();
        list.insertTail(new DNode<>(1));
        list.insertTail(new DNode<>(2));
        list.insertTail(new DNode<>(3));
        list.clear();
        assertEquals(null, list.head);
        assertEquals(null, list.tail);
        assertEquals(0, list.size);
    }

    @Test
    public void testPrint() {
        DLL<Integer> list = new DLL<>();
        list.insertTail(new DNode<>(1));
        list.insertTail(new DNode<>(2));
        list.insertTail(new DNode<>(3));
        list.print();
    }

}
