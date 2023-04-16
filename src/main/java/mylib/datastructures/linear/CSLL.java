package src.main.java.mylib.datastructures.linear;

import src.main.java.mylib.datastructures.nodes.SNode;

public class CSLL extends SLL {
    private SNode head;
    private SNode tail;
    private int size;
    private boolean sorted;

    public CSLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.sorted = true;
    }

    public CSLL(SNode node) {
        this.head = node;
        this.tail = node;
        this.sorted = true;

        if (head != null) {
            tail = head;
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            tail.setNext(head);
            size++;
        } else {
            tail = null;
        }
    }

    
    public SNode getHead() {return this.head;}
    public SNode getTail() {return this.tail;}
    public int getSize() {return this.size;}
    

    @Override
    public void insertHead(SNode node) {
        if (head == null) {
            head = node;
            tail = node;
            node.setNext(head);
        } else {
            node.setNext(head);
            head = node;
            tail.setNext(head);
        }
        size++;
    }

    @Override
    public void insertTail(SNode node) {
        if (tail == null) {
            head = node;
            tail = node;
            node.setNext(head);
        } else {
            tail.setNext(node);
            tail = node;
            node.setNext(head);
        }
        size++;
    }

    @Override
    public void insert(SNode node, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        } else if (position == 0) {
            if (size == 0) { 
                node.setNext(node); 
                head = node;
                tail = node;
            } else {
                node.setNext(head);
                head = node;
                tail.setNext(head); 
            }
            size++;
        } else if (position == size) {
            insertTail(node);
        } else {
            SNode current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
            node.setNext(current.getNext());
            current.setNext(node);
            size++;
        }
        this.sorted = false;
    }

    @Override
    public void sort() {
        if (!sorted) {
            if (head == null || head == tail) {
                sorted = true;
                return;
            }
            SNode curr = head;
            do {
                SNode next = curr.getNext();
                while (next != head) {
                    if (curr.getData() > next.getData()) {
                        int temp = curr.getData();
                        curr.setData(next.getData());
                        next.setData(temp);
                    }
                    next = next.getNext();
                }
                curr = curr.getNext();
            } while (curr != head);
            sorted = true;
        }
    }

    @Override
    public void sortedInsert(SNode node) {
        if (head == null) {
            this.head = node;
            this.tail = node;
            node.setNext(node);
            size++;
            this.sorted = true;
            return;
        }
        if (!sorted) {
            sort();
        }
        SNode prev = null;
        SNode curr = head;
        do {
            if (node.getData() <= curr.getData()) {
                break;
            }
            prev = curr;
            curr = curr.getNext();
        } while (curr != head);
    
        if (prev == null) {
            node.setNext(head);
            head = node;
            tail.setNext(node);
        } else {
            prev.setNext(node);
            node.setNext(curr);
            if (curr == head) {
                tail = node;
            }
        }
        size++;
        this.sorted = true;
    }
    
    @Override
    public SNode search(SNode node) {
        if (head == null) {
            return null;
        }
        
        SNode current = head;
        
        do {
            if (current.getData() == node.getData()) {
                return current;
            }
            current = current.getNext();
        } while (current != head);
        
        return null;
    }

    @Override
    public void deleteHead() {
        if (head == null) {
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            tail.setNext(head);
        }
        size--;
    }

    @Override
    public void deleteTail() {
        if (tail == null) {
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            SNode curr = head;
            while (curr.getNext() != tail) {
                curr = curr.getNext();
            }
            curr.setNext(head);
            tail = curr;
        }
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
        SNode prev = head;
        while (prev.getNext() != head && !prev.getNext().equals(node)) {
            prev = prev.getNext();
        }
        if (prev.getNext() == head) {  
            return;
        }
        if (prev.getNext().equals(tail)) {  
            tail = prev;
        }
        prev.setNext(prev.getNext().getNext());
        size--;
    }
    
    @Override
    public void clear() {
        if (head == null) {
            return;
        }
        tail.setNext(null); 
        head = null;
        tail = null;
        size = 0;
        sorted = true;
    }
        
    @Override
    public void print() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("List length: " + size);
            System.out.println("Sorted Status: " + (sorted ? "sorted" : "not sorted"));
            System.out.print("List content: ");
            SNode curr = head;
            do {
                System.out.print(curr.getData() + " ");
                curr = curr.getNext();
            } while (curr != head);
            System.out.println();
        }
    }
}
