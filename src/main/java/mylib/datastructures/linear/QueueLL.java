package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.SNode;

public class QueueLL extends SLL {
    private SNode head;
    private SNode tail;
    private int size;
    
    public QueueLL() {
        super();
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public QueueLL(SNode head) {
        super(head);
        this.head = head;
        this.tail = head;
        this.size = 1;
    }

    public int peek() {
        return this.head.getData();
    }

    public void enqueue(SNode node) {
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
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
    
    public void dequeue() {
        super.deleteHead();
        head = head.getNext();
        size--;
    }
    
    @Override
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
        if (node.equals(tail)) {  
            deleteTail();
            return;
        }
        
        SNode prev = head;
        while (prev.getNext() != null && !prev.getNext().equals(node)) {
            prev = prev.getNext();
        }
        
        if (prev.getNext() == null) {  
            return;
        }
        
        prev.setNext(prev.getNext().getNext());
        size--;
    }  

    @Override
    public void clear() {
        super.clear();
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void print() {
        System.out.println("Queue length: " + size);
        System.out.print("Queue content (front to rear): ");
        SNode curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
    
    @Override
    public void insert(SNode node, int position) {
    }

    @Override
    public void insertHead(SNode node) {
    }

    @Override
    public void sort() {
    }

    @Override
    public void sortedInsert(SNode node) {
    }

    @Override
    public void deleteTail() {
    }

    
}
