package src.main.java.mylib.datastructures;

import java.beans.Transient;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.mylib.datastructures.linear.SLL;
import src.main.java.mylib.datastructures.nodes.SNode;

public class SLLTest {

    private SLL<Integer> sll;

    @BeforeEach
    void setUp() {
        sll = new SLL<>();
    }

    @Test
    void testInsertHead() {
        sll.insertHead(new SNode<>(1));
        Assertions.assertEquals(1, sll.getHead().getData());
        Assertions.assertEquals(1, sll.tail.getData());
        Assertions.assertEquals(1, sll.size);
    }

    @Test
    void testInsertTail() {
        sll.insertTail(new SNode<>(1));
        Assertions.assertEquals(1, sll.getHead().getData());
        Assertions.assertEquals(1, sll.tail.getData());
        Assertions.assertEquals(1, sll.size);

    }

    @Test
    void testInsert() {
        sll.insert(new SNode<>(1), 0);
        sll.insert(new SNode<>(3), 1);
        sll.insert(new SNode<>(2), 1);
        Assertions.assertEquals(1, sll.getHead().getData());
        Assertions.assertEquals(3, sll.tail.getData());
        Assertions.assertEquals(3, sll.size);
    }

    @Test
    void testSortedInsert() {
        sll.sortedInsert(new SNode<>(3));
        sll.sortedInsert(new SNode<>(1));
        sll.sortedInsert(new SNode<>(2));
        Assertions.assertEquals(1, sll.getHead().getData());
        Assertions.assertEquals(3, sll.tail.getData());
        Assertions.assertEquals(3, sll.size);
    }

    @Test
    void testSearch() {
        sll.insertHead(new SNode<>(1));
        sll.insertTail(new SNode<>(2));
        Assertions.assertEquals(2, sll.search(new SNode<>(2)).getData());
        Assertions.assertNull(sll.search(new SNode<>(3)));
    }

    @Test
    void testDeleteHead() {
        sll.insertHead(new SNode<>(1));
        sll.insertTail(new SNode<>(2));
        sll.deleteHead();
        Assertions.assertEquals(2, sll.getHead().getData());
        Assertions.assertEquals(2, sll.tail.getData());
        Assertions.assertEquals(1, sll.size);

    }

    @Test
    void testDeleteTail() {
        sll.insertHead(new SNode<>(1));
        sll.insertTail(new SNode<>(2));
        sll.deleteTail();
        Assertions.assertEquals(1, sll.getHead().getData());
        Assertions.assertEquals(1, sll.tail.getData());
        Assertions.assertEquals(1, sll.size);

    }

    @Test
    void testDelete() {
        sll.insert(new SNode<>(1), 0);
        sll.insert(new SNode<>(3), 1);
        sll.insert(new SNode<>(2), 1);
        sll.delete(new SNode<>(2));
        Assertions.assertEquals(1, sll.getHead().getData());
        Assertions.assertEquals(3, sll.tail.getData());
        Assertions.assertEquals(2, sll.size);
    }

    @Test
    public void testSort() {
        SLL<Integer> list = new SLL<>();
        list.insertHead(new SNode<>(3));
        list.insertHead(new SNode<>(1));
        list.insertHead(new SNode<>(4));
        list.insertHead(new SNode<>(2));
        list.insertHead(new SNode<>(5));
        list.sort();
        Assertions.assertEquals(1, (int) list.getHead().getData());
        Assertions.assertEquals(2, (int) list.getHead().getNext().getData());
        Assertions.assertEquals(3, (int) list.getHead().getNext().getNext().getData());
        Assertions.assertEquals(4, (int) list.getHead().getNext().getNext().getNext().getData());
        Assertions.assertEquals(5, (int) list.getHead().getNext().getNext().getNext().getNext().getData());

    }

    @Test
    public void testClear() {
        SLL<String> list = new SLL<>();
        list.insertHead(new SNode<>("cat"));
        list.insertHead(new SNode<>("dog"));
        list.insertHead(new SNode<>("bird"));
        list.clear();
        assertNull(list.getHead());
        assertNull(list.tail);
        Assertions.assertEquals(0, list.getSize());

    }

    @Test
    public void testPrint() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(new SNode<Integer>(2));
        list.insertHead(new SNode<Integer>(1));
        list.insertHead(new SNode<Integer>(3));

        list.print();

        String expectedOutput = "List length: 3\nSorted status: false\nList content: 1 2 3 \n";
        Assertions.assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);
    }
}
