package src.main.java.mylib.datastructures.test;

import src.main.java.mylib.datastructures.nodes.DNode;

public class DNodeTest {
    public static void main(String[] args) {
        
        /** Test DNode Class methods */
        System.out.println();
        System.out.println("***Testing DNode Class...***");
        System.out.println();

        // create a new DNode object by using overloaded constructor
        DNode node1 = new DNode(7);
        System.out.println("A DNode object is successfully created via DNode overloaded constructor with \"data\" 7.");

        // test getters
        System.out.println("Expected data : 7, Actual data : " + node1.getData());
        System.out.println("Expected prev : null, Actual prev : " + node1.getPrev());
        System.out.println("Expected next : null, Actual next : " + node1.getNext());

        // create a new DNode object by using default constructor
        DNode node2 = new DNode();

        System.out.println();
        System.out.println("A DNode object is successfully created via DNode default constructor.");

        System.out.println("Expected data : 0, Actual data : " + node2.getData());
        System.out.println("Expected prev : null, Actual prev : " + node1.getPrev());
        System.out.println("Expected next : null, Actual next : " + node1.getNext());
        
        // test setters
        node2.setData(5);
        node2.setPrev(new DNode(4));
        node2.setNext(new DNode(6));

        System.out.println();
        System.out.println("DNode setters successfully set \"data\" to 5, \"prev\" with a new DNode with \"data\" 4 and \"next\" with a new DNode with \"data\" 6.");

        System.out.println("Expected data : 5, Actual data : " + node2.getData());
        System.out.println("Expected prev node's data : 4, Actual next node's data : " + node2.getPrev().getData());
        System.out.println("Expected next node's data : 6, Actual next node's data : " + node2.getNext().getData());
        
        // end of the test
        System.out.println();
        System.out.println("***SNode Class Testing Completed!***");
        
    }    
}
