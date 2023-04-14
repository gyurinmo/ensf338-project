package src.main.java.mylib.datastructures;

import src.main.java.mylib.datastructures.linear.SLL;
import src.main.java.mylib.datastructures.nodes.SNode;

public class SLLTest {
    public static void main (String[] args) {
        SLL<Integer> sll = new SLL<>();

        sll.insertHead(new SNode<>(1));
        sll.insertTail(new SNode<>(3));
        sll.insert(new SNode<>(2), 1);
        sll.sortedInsert(new SNode<>(0));
        sll.sortedInsert(new SNode<>(4));

        sll.print();

        sll.delete(new SNode<>(2));
        sll.deleteHead();
        sll.deleteTail();

        sll.print();
    }
}
