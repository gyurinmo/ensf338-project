package src.main.java.mylib.datastructures;

import src.main.java.mylib.datastructures.linear.CSLL;
import src.main.java.mylib.datastructures.nodes.SNode;

public class CSLLTest {
    public static void main(String[] args) {
        CSLL<Integer> csll = new CSLL<>();

        System.out.println("Inserting values 1, 2, and 3 at tail");
        csll.insertTail(new SNode<>(1));
        csll.insertTail(new SNode<>(2));
        csll.insertTail(new SNode<>(3));
        System.out.println("Expected output: 1 2 3");
        System.out.println("Actual output: ");
        csll.print();

        System.out.println("Deleting head");
        csll.deleteHead();
        System.out.println("Expected output: 2 3");
        System.out.println("Actual output: ");
        csll.print();

        System.out.println("Deleting tail");
        csll.deleteTail();
        System.out.println("Expected output: 2");
        System.out.println("Actual output: ");
        csll.print();

        System.out.println("Deleting value 2");
        csll.delete(new SNode<>(2));
        System.out.println("Expected output: ");
        System.out.println("Actual output: ");
        csll.print();
    }
}
