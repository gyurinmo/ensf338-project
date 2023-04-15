package src.main.java.mylib.datastructures.nodes;

public class SNode {
    private int data;
    private SNode next;

    public SNode() {
        this.data = 0;
        this.next = null;
    }
    
    public SNode(int data) {
        this.data = data;
        this.next = null;
    }

    // getters
    public int getData() { return data; }
    public SNode getNext() { return next; }

    // setters
    public void setData(int data) { this.data = data; }
    public void setNext(SNode next) { this.next = next; }
}



