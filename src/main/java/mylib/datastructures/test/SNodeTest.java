package src.main.java.mylib.datastructures.test;

import src.main.java.mylib.datastructures.nodes.SNode;

public class SNodeTest {
    public static void main(String[] args) {
        
        /** Test SNode Class methods */
        System.out.println();
        System.out.println("***Testing SNode Class...***");
        System.out.println();

        // create a new SNode object by using overloaded constructor
        SNode node1 = new SNode(1);
        System.out.println("An SNode object is successfully created via SNode overloaded constructor with \"data\" 1.");

        // test getters
        System.out.println("Expected data : 1, Actual data : " + node1.getData());
        System.out.println("Expected next : null, Actual next : " + node1.getNext());

        // create a new SNode object by using default constructor
        SNode node2 = new SNode();

        System.out.println();
        System.out.println("An SNode object is successfully created via SNode default constructor.");

        System.out.println("Expected data : 0, Actual data : " + node2.getData());
        System.out.println("Expected next : null, Actual next : " + node1.getNext());
        
        // test setters
        node2.setData(2);
        node2.setNext(new SNode(3));

        System.out.println();
        System.out.println("SNode setters successfully set \"data\" to 2 and \"next\" with a new SNode with \"data\" 3.");

        System.out.println("Expected data : 2, Actual data : " + node2.getData());
        System.out.println("Expected next node's data : 3, Actual next node's data : " + node2.getNext().getData());
        
        // end of the test
        System.out.println();
        System.out.println("***SNode Class Testing Completed!***");
        
    }
}