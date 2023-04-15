package src.main.java.mylib.datastructures.test;

import src.main.java.mylib.datastructures.nodes.TNode;

public class TNodeTest {
    public static void main(String[] args) {
        
        /** Test TNode Class methods */
        System.out.println();
        System.out.println("***Testing TNode Class...***");
        System.out.println();

        // create a new TNode object by using overloaded constructor
        TNode node1 = new TNode(5, 0, null, null, null);
        System.out.println("A TNode object is successfully created via TNode overloaded constructor!");

        // test getters
        System.out.println("Expected data: 5, Actual data: " + node1.getData());
        System.out.println("Expected balance: 0, Actual balance: " + node1.getBalance());
        System.out.println("Expected parent: null, Actual parent: " + node1.getParent());
        System.out.println("Expected left: null, Actual left " + node1.getLeft());
        System.out.println("Expected right: null, Actual right: " + node1.getRight());

        // create a new TNode object by using default constructor
        TNode node2 = new TNode();

        System.out.println();
        System.out.println("A TNode object is successfully created via TNode default constructor!");

        System.out.println("Expected data: 0, Actual data: " + node2.getData());
        System.out.println("Expected balance: 0, Actual balance: " + node2.getBalance());
        System.out.println("Expected parent: null, Actual parent: " + node2.getParent());
        System.out.println("Expected left: null, Actual left " + node2.getLeft());
        System.out.println("Expected right: null, Actual right: " + node2.getRight());
        
        // test setters
        node2.setData(3);
        node2.setBalance(1);
        node2.setLeft(new TNode(4, 0, null, null, null));
        node2.setRight(new TNode(7, 0, null, null, null));
        node2.setParent(new TNode(2, 0, null, null, null));

        System.out.println();
        System.out.println("TNode setters successfully set member varialbes!");

        System.out.println("Expected data: 3, Actual data: " + node2.getData());
        System.out.println("Expected balance: 1, Actual balance: " + node2.getBalance());
        System.out.println("Expected left data: 4, Actual left data: " + node2.getLeft());
        System.out.println("Expected right data: 7, Actual right data: " + node2.getRight());
        System.out.println("Expected parent data: 2, Actual parent data: " + node2.getParent());

        // test print(), toString() is tested in the print()
        System.out.println();
        System.out.println("Testing TNode print() and toString()...");

        System.out.println("Expected output: ");
        System.out.println("Node data: 3, balance: 1");
        System.out.println("Actual output: ");
        node2.print();

        System.out.println();
        System.out.println("***TNode Class Testing Completed!***");
        
    }
}