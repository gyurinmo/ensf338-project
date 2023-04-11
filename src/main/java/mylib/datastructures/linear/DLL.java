package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.DNode;

public class DLL<T> {
    private DNode<T> head;
    private DNode<T> tail;
    private int size;

    public DLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public DLL(DNode<T> head) {
        this.head = head;
        this.tail = head;
        head.setPrev(null);
        tail.setNext(null);
        size = 1;
    }

    public void insertHead(DNode<T> node) {
        if (head == null) {
            head = node;
            tail = node;

        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
        size++;
    }

    public void insertTail(DNode<T> node) {
        if(tail == null) {
            head = node;
            tail = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void insert(DNode<T> node, int position) {
        if(position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        if (position == 0) {
            insertHead(node);
        } else if (position == size) {
            insertTail(node);
        } else {
            DNode<T> curr = head;
            for (int i = 0; i < position; i++) {
                curr = curr.getNext();
            }
            node.setNext(curr);
            node.setPrev(curr.getPrev());
            curr.getPrev().setNext(node);
            curr.setPrev(node);
            size++;
        }
    }

    public void sortedInsert(DNode<T> node) {
        if (head == null) {
            insertHead(node);
            return;
        }
        if (!isSorted()) {
            sort();
        }
        DNode<T> curr = head;
        DNode<T> prev = null;
        while (curr != null && ((Comparable<T>) curr.getData()).compareTo(node.getData()) < 0) {
            prev = curr;
            curr = curr.getNext();
        }
        if (prev == null) {
            insertHead(node);
        } else if (curr == null) {
            insertTail(node);
        } else {
            node.setNext(curr);
            node.setPrev(prev);
            prev.setNext(node);
            curr.setPrev(node);
            size++;
        } 
    }

    private boolean isSorted() {
        return false;
    }

    public DNode<T> search(DNode<T> node) {
        DNode<T> curr = head;
        while (curr != null) {
            if (curr.getData().equals(node.getData())) {
                return curr;
            }
            curr = curr.getNext();
        }
        return null;
    }

    public void deleteHead() {
        if (head != null) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null;

            }
            size--;
        }
    }
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
        tail = tail.getPrev();
        tail.setNext(null);
        size--;
    }

    public void delete(DNode<T> node) {
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
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        size--;

    }

    public void sort() {
        if (size <= 1) {
            return;
        }
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            DNode<T> curr = head;
            while (curr.getNext() != null) {
                if (((Comparable<T>) curr.getData()).compareTo(curr.getNext().getData()) > 0) {
                    swap(curr, curr.getNext());
                    sorted = false;

                } else {
                    curr = curr.getNext();
                }
            }
        }
    }
    
    private void swap(DNode<T> curr, DNode<T> next) {
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        System.out.print("[");
        DNode<T> curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println("]");
    }
}
