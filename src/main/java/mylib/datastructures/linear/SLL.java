package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.SNode;

public class SLL {
    private SNode head;
    private SNode tail;
    private int size;
    private boolean sorted;

    public SLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.sorted = true;
    }

    public SLL(SNode head) {
        this.head = head;
        this.tail = head;
        this.size = 1;
        this.sorted = true;
    }

    public SNode getHead() { return this.head; }

    public void insertHead(SNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
        this.sorted = false;
        size++;
    }

    public void insertTail(SNode node) {
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        this.sorted = false;
        size++;
    }

  
    public void insert(SNode node, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        } else if (position == 0) {
            insertHead(node);
        } else if (position == size) {
            insertTail(node);
        } else {
            SNode current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
                node.setNext(current.getNext());
                current.setNext(node);
                size++;
            }
            this.sorted = false;
        }
    }

    public void sortedInsert(SNode node) {
        if (head == null) {
            this.head = node;
            this.tail = node;
            size++;
            this.sorted = true;
            return;
        }
        if (!sorted) {
            sort();
        }
        
        SNode prev = null;
        SNode curr = head;
        while (curr != null && node.getData() > curr.getData()) {
            prev = curr;
            curr = curr.getNext();
        }
        
        if (prev == null) {  
            node.setNext(head);
            head = node;
        } else if (curr == null) { 
            tail.setNext(node);
            tail = node;
        } else {  
            prev.setNext(node);
            node.setNext(curr);
        }
        size++;
        this.sorted = true;
    }

    public SNode search(SNode node) {
        SNode current = head;

        while (current != null) {
            if (current.getData() == node.getData()) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void deleteHead() {
        if (head == null) {  
            return;
        }
        if (head == tail) { 
            head = null;
            tail = null;
        } else {  
            head = head.getNext();
        }
        size--;
    }

    public void deleteTail() {
        if (tail == null) { 
            return;
        }
        if (head == tail) { 
            head = null;
            tail = null;
        } else {  
            SNode prev = head;
            while (prev.getNext() != tail) {
                prev = prev.getNext();
            }
            prev.setNext(null);
            tail = prev;
        }
        size--;
    }

    public void delete(SNode node) {
        if (head == null) {  
            System.out.println("The list is empty.");
            System.out.println();
            return;
        }
        if (node.equals(head)) {  
            deleteHead();
            return;
        }
        
        SNode prev = head;
        while (prev.getNext() != null && !prev.getNext().equals(node)) {
            prev = prev.getNext();
        }
        
        if (prev.getNext() == null) {  
            return;
        }
        
        if (prev.getNext().equals(tail)) {  
            tail = prev;
        }
        
        prev.setNext(prev.getNext().getNext());
        size--;
    }
    
    public void sort() {
        if (!sorted) {
            SNode curr = head;
            while (curr != null) {
                SNode next = curr.getNext();
                while (next != null) {
                    if (curr.getData() > next.getData()) {
                        int temp = curr.getData();
                        curr.setData(next.getData());
                        next.setData(temp);
                    }
                    next = next.getNext();
                }
                curr = curr.getNext();
            }
            sorted = true;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        sorted = true;
    }

    public void print() {
        System.out.println("List length: " + size);
        System.out.println("Sorted status: " + (sorted ? "sorted" : "not sorted"));
        System.out.print("List content: ");
        SNode curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
}
