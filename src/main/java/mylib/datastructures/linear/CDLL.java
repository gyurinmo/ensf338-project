package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.DNode;
import src.main.java.mylib.datastructures.linear.DLL;

public class CDLL<T> extends DLL<T> {
    public CDLL() {
        super();
        head.setPrev(tail);
        tail.setNext(head);
    }

    public CDLL(DNode<T> node) {
        super(node);
        head.setPrev(tail);
        tail.setNext(head);
    }

    @Override 
    public void insertHead(DNode<T> node) {
        super.insertHead(node);
        head.setPrev(tail);
        tail.setNext(head);
    }

    @Override
    public void insertTail(DNode<T> node) {
        super.insertTail(node);
        head.setPrev(tail);
        tail.setNext(head);
    }

    @Override
    public void insert(DNode<T> node, int position) {
        super.insert(node, position);
        head.setPrev(tail);
        tail.setNext(head);
    }

    @Override
    public void deleteHead() {
        super.deleteHead();
        head.setPrev(tail);
        tail.setNext(head);
    }

    @Override
    public void deleteTail() {
        super.deleteTail();
        head.setPrev(tail);
        tail.setNext(head);
    }

    @Override
    public void delete(DNode<T> node) {
        super.delete(node);
        head.setPrev(tail);
        tail.setNext(head);
    }
}
