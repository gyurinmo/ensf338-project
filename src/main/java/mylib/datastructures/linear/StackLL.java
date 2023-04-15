package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.SNode;

public class StackLL extends SLL {
    private SNode head;
    private int size;
    private boolean sorted;
    
    public StackLL() {
        super();
        this.head = null;
        this.size = 0;
        this.sorted = true;
    }

    public StackLL(SNode head) {
        super(head);
        this.head = head;
        this.size = 1;
        this.sorted = true;
    }

    public int peek() {
        return this.head.getData();
    }

    public void push(SNode node) {
        super.insertHead(node);
        this.head = node;
        size++;
        this.sorted = false;
    }

    public void pop() {
        super.deleteHead();
        head = head.getNext();
        size--;
    }

    public void sortedPush(SNode node) {
        if (head == null) {
            head = node;
        } else {
            if (!sorted) {
                sort();
            }
            if (node.getData() <= head.getData()) {
                node.setNext(head);
                head = node;
            } else {
                SNode current = head;
                while (current.getNext() != null && node.getData() > current.getNext().getData()) {
                    current = current.getNext();
                }
                node.setNext(current.getNext());
                current.setNext(node);
            }
            size++;
            this.sorted = true;
        }
    }

    @Override
    public SNode search(SNode node) {
        SNode result = super.search(node);
        return result;
    }
    
    @Override
    public void sort() {
        super.sort();
        this.sorted = true;
    }

    @Override
    public void delete(SNode node) {
        super.delete(node);
    }
    
    @Override
    public void clear() {
        super.clear();
        this.head = null;
        this.size = 0;
        this.sorted = true;
    }
    
    @Override
    public void print() {
        System.out.println("Stack size: " + size);
        System.out.println("Sorted status: " + (sorted ? "sorted" : "not sorted"));        
        System.out.print("Stack content (top to bottom): ");
        SNode curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }  

    @Override
    public void insertTail(SNode node) {
    }

    @Override
    public void deleteTail() {
    }
}