package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.SNode;
import src.main.java.mylib.datastructures.linear.SLL;

public class CSLL<T> extends SLL<T> {

    public CSLL() {
        super();
    }

    public CSLL(SNode<T> head) {
        super(head);
        head.setNext(head);
    }

    @Override 
    public void insertTail(SNode<T> node) {
        if (tail == null) {
            head = node;
            tail = node;
            node.setNext(head);
        } else {
            node.setNext(head);
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override 
    public void deleteHead() {
        if (head != null) {
            head = head.getNext();
            tail.setNext(head);
            size--;
            if (head == null) {
                tail = null;
            }
        }
    }

    @Override 
    public void deleteTail() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        SNode<T> curr = head;
        while (curr.getNext() != tail) {
            curr = curr.getNext();
        }
        curr.setNext(head);
        tail = curr;
        size--;
    }
    
    @Override 
    public void delete(SNode<T> node) {
        if (size == 0) {
            return;
        }
        if (head.equals(node)) {
            deleteHead();
            return;
        }
        if (tail.equals(node)) {
            deleteTail();
            return;
        }
        SNode<T> curr = head;
        while (curr.getNext() != head) {
            if (curr.getNext().equals(node)) {
                curr.setNext(curr.geetNext().getNext());
                size--;
                return;
            }
            curr = curr.getNext();
        }
    }
}