package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.SNode;

public class SLL<T> {
    private SNode<T> head;
    private SNode<T> tail;
    private int size;

    public SLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public SLL(SNode<T> head) {
        this.head = head;
        this.tail = head;
        size = 1;
    }

    public void insertHead(SNode<T> node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public void insertTail(SNode<T> node) {
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void insert(SNode<T> node, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        if (position == 0) {
            insertHead(node);
        } else if (position == size) {
            insertTail(node);
        } else {
            SNode<T> curr = head;
            for (int i = 0; i < position - 1; i++) {
                curr = curr.getNext();
            }
            node.setNext(curr.getNext());
            curr.setNext(node);
            size++;
        }
    }

    public void sortedInsert(SNode<T> node) {
        if (head == null) {
            insertHead(node);
            return;
        }
        if (!isSorted()) {
            sort();
        }
        SNode<T> curr = head;
        SNode<T> prev = null;
        while (curr != null && ((Comparable<T>) curr.getData()).compareTo(node.getData()) < 0) {
            prev = curr;
            curr = curr.getNext();
        }
        if (prev == null) {
            insertHead(node);
        } else if (curr == null) {
            insertTail(node);
        } else {
            prev.setNext(node);
            node.setNext(curr);
            size++;
        }
    }

    public SNode<T> search(SNode<T> node) {
        SNode<T> curr = head;
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
            size--;
            if (head == null) {
                tail = null;
            }
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
        SNode curr = head;
        while (curr.getNext() != tail) {
            curr = curr.getNext();
        }
        curr.setNext(null);
        tail = curr;
        size--;
    }

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
        while (curr.getNext() != null) {
            if (curr.getNext().equals(node)) {
                curr.setNext(curr.getNext().getNext());
                size--;
                return;
            }
            curr = curr.getNext();
        }
    }

    public void sort() {
        if(size <= 1) {
            return;
        }
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            SNode<T> curr = head;
            SNode<T> prev = null;
            while (curr.next != null) {
                if (((Comparable<T>) curr.data).compareTo(curr.next.data) > 0) {
                    sorted = false;
                    SNode<T> temp = curr.next;
                    curr.next = temp.next;
                    temp.next = curr;
                    if (prev == null) {
                        head = temp;
                    } else {
                        prev.next = temp;
                    }
                    prev = temp;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            tail = prev;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        System.out.println("List length: " + size);
        System.out.println("Sorted status: " + isSorted());
        System.out.print("List content: ");
        SNode<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private String isSorted() {
        return null;
    }

    public SNode<T> getHead() {
        return null;
    }
}
