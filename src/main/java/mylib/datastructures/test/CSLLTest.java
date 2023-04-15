package src.main.java.mylib.datastructures.test;

import src.main.java.mylib.datastructures.linear.CSLL;
import src.main.java.mylib.datastructures.nodes.SNode;

public class CSLLTest {
    public static void main (String[] args) {
    
    // Test CSLL Class methods 
    System.out.println();
    System.out.println();
    System.out.println("***Testing CSLL Class...***");
    System.out.println();


    // create a new CSLL object by using overloaded constructor CSLL(SNode head) which calls SLL(SNode node)
    CSLL csll1 = new CSLL(new SNode(2));

    System.out.println("Overloaded constructor CSLL(SNode head) created a new CSLL object \"csll1\".");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("Size of csll1: 1"); 
    System.out.println("Value of head node of csll2: 2"); 
    System.out.println("Value of tail node of csll2: 2"); 
    System.out.println();

    // actual result 
    System.out.println("Actual Result: ");
    System.out.println("Size of csll1: " + csll1.getSize()); 
    System.out.println("Value of head node of csll2: " + csll1.getHead().getData());
    System.out.println("Value of tail node of csll2: " + csll1.getTail().getData());
    System.out.println();


    // create a new CSLL object by using default constructor CSLL()
    CSLL csll2 = new CSLL();
    System.out.println();
    System.out.println("Default constructor CSLL() successfully created a new CSLL object \"csll2\".");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("Size of csll1: 0"); 
    System.out.println("Value of head node of csll2: null"); 
    System.out.println("Value of tail node of csll2: null"); 
    System.out.println();

    // actual result
    System.out.println("Actual Result: ");
    System.out.println("Size of csll1: " + csll2.getSize()); 
    System.out.println("Value of head node of csll2: " + csll2.getHead());
    System.out.println("Value of tail node of csll2: " + csll2.getTail());
    System.out.println();
    System.out.println();

    // test intereted and modified insertHead(SNode node) method from SLL class
    csll2.insertHead(new SNode(5));
    System.out.println("insertHead(SNode node) method successfully inserted 5 to the head of \"csll2\".");

    // test inherited and modified insertHead(SNode node) method from SLL class
    csll2.insertHead(new SNode(2));
    System.out.println("insertHead(SNode node) method successfully inserted 2 to the head of \"csll2\".");

    // test inherited and modified insertTail(SNode node) method from SLL class
    csll2.insertTail(new SNode(8));
    System.out.println("insertTail(SNode node) method successfully inserted 8 to the tail of \"csll2\".");

    // test inherited and modified insert(SNode node, int position) method from SLL class
    csll2.insert(new SNode(3), 2);
    System.out.println("insertHead(SNode node) method successfully inserted 3 to position 2 of \"csll2\".");
    System.out.println();
    
    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length : 4");
    System.out.println("Sorted Status : not sorted");
    System.out.println("List Content: 2 5 3 8");
    System.out.println();

    // actual result displayed by test()
    System.out.println("Actual Result: ");
    csll2.print();
    System.out.println();


    // test inherited and modified sort() method from SLL class
    csll2.sort();
    System.out.println();
    System.out.println("sort() method successfully sorted data in \"csll2\" in an ascending order.");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length : 4");
    System.out.println("Sorted Status : sorted");
    System.out.println("List Content: 2 3 5 8");
    System.out.println();

    // actual result displayed by test()
    System.out.println("Actual Result: ");
    csll2.print();
    System.out.println();


    // test inherited and modified sortedInsert(SNode node) method from SLL class
    SNode node2 = new SNode(7);
    System.out.println();
    System.out.println("SNode(int data) method successfully created a SNode object with data 7.");;
    csll2.sortedInsert(node2);
    System.out.println("sortedInsert(SNode node) method successfully inserted a new SNode with \"data\" 7 in a sorted order.");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length : 5");
    System.out.println("Sorted Status : sorted");
    System.out.println("List Content: 2 3 5 7 8");
    System.out.println();

    // actual result displayed by test()
    System.out.println("Actual Result: ");
    csll2.print();
    System.out.println();


    // test inherited and modified search(SNode node) method from SLL class, successful case
    System.out.println();
    System.out.println("Testing search(SNode node) method by using previously created SLL object \"csll2\"...");
    System.out.println();

    SNode nodeToSearch1 = new SNode(5);
    System.out.println("SNode(int data) method successfully created a SNode object with data 5.");;

    // expected result
    System.out.print("Expected Search Result : ");
    System.out.println("Found node with value 5");
  
    // actual result
    System.out.print("Actual Search Result : ");
    SNode foundNode1 = csll2.search(nodeToSearch1);
    if (foundNode1 != null) {
        System.out.println("Found node with value " + foundNode1.getData());
    } else {
        System.out.println("Node not found");
    }

    // test inherited and modified search(SNode node) method from SLL class, not successful case
    SNode nodeToSearch2 = new SNode(1);
    System.out.println();
    System.out.println("Node(int data) method successfully created a Node object with data 1.");;

    // expected result
    System.out.print("Expected Search Result : ");
    System.out.println("Node not found");
  
    // actual result
    System.out.print("Actual Search Result : ");
    SNode foundNode2 = csll2.search(nodeToSearch2);
    if (foundNode2 != null) {
        System.out.println("Found node with value " + foundNode2.getData());
    } else {
        System.out.println("Node not found");
    }
    System.out.println();

    // test inherited and modified deleteHead() method from SLL class
    csll2.deleteHead();
    System.out.println();
    System.out.println("deleteHead() method successfully deleted the head of \"csll2\".");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length : 4");
    System.out.println("Sorted Status : sorted");
    System.out.println("List Content: 3 5 7 8");
    System.out.println();

    // actual result displayed by print()
    System.out.println("Actual Result: ");
    csll2.print();
    System.out.println();


    // test inherited and modified deleteTail() method from SLL class
    csll2.deleteTail();
    System.out.println();
    System.out.println("deleteTail() method successfully deleted the tail of \"csll2\".");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length : 3");
    System.out.println("Sorted Status : sorted");
    System.out.println("List Content: 3 5 7");
    System.out.println();

    // actual result displayed by print()
    System.out.println("Actual Result: ");
    csll2.print();
    System.out.println();


    // test inherited and modified clear() method from SLL class
    csll2.clear();
    System.out.println();
    System.out.println("clear() method successfully removed all nodes in the previously created SLL object \"csll2\".");
    System.out.println();

    // expected result
    System.out.print("Expected Result: ");
    System.out.println("The list is empty.");

    // actual result displayed by print()
    System.out.print("Actual Result: ");
    csll2.print();

    // end of  the test
    System.out.println();
    System.out.println("***CSLL Class Testing Completed!***");
    
    }
}
