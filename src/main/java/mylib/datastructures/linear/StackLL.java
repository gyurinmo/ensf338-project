package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.SNode;
import java.util.EmptyStackException;

public class StackLL<T> extends SLL<T> {

    @Override
    public void insertTail(SNode<T> node) {

    }

    @Override 
    public void insert(SNode<T> node, int position) {

    }

    @Override
    public void sortedInsert(SNode<T> node) {

    }

    @Override
    public void delete(SNode<T> node) {

    }

    @Override
    public void sort() {

    }

    public void push(T data) {
        insertHead(new SNode<>(data));
    }

    public T pop() {
        SNode<T> top = getHead();
        if (top == null) {
            throw new EmptyStackException();
        }
        deleteHead();
        return top.getData();
    }

    public T peek() {
        SNode<T> top = getHead();
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getData();
    }
}
