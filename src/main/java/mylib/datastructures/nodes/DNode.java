package src.main.java.mylib.datastructures.nodes;

public class DNode {
    private int data;
    private DNode prev;
    private DNode next;

    public DNode() {
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    public DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    // getters
    public int getData() { return data; }
    public DNode getPrev() { return prev; }
    public DNode getNext() { return next; }

    // setters
    public void setData(int data) { this.data = data; }
    public void setPrev(DNode prev) { this.prev = prev; }
    public void setNext(DNode next) { this.next = next; }
}
