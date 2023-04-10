package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.SNode;
import src.main.java.mylib.datastructures.linear.SLL;

public class QueueLL<T> extends SLL<T> {
    public QueueLL() {
        super();
    }

    public void enqueue(SNode<T> node) {
        super.insertTail(node);
    }

    public SNode<T> dequeue() {
        SNode<T> node = super.getHead();
        super.deleteHead();
        return node;
    }

    @Override
    public void insertHead(SNode<T> node) {

    }

    @Override
    public void sortedInsert(SNode<T> node) {

    }
}
