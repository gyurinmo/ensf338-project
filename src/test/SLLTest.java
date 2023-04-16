package src.test;

import src.main.java.mylib.datastructures.linear.SLL;
import src.main.java.mylib.datastructures.nodes.SNode;

public class SLLTest {
    public static void main (String[] args) {
    
    // Test SLL Class methods 
    System.out.println();
    System.out.println();
    System.out.println("***Testing SLL Class...***");


    // create a new SLL object by using overloaded constructor SLL(SNode head)
    SNode node1 = new SNode(6);
    System.out.println();
    System.out.println("SNode(int data) method successfully created an SNode object with data 6.");;
    SLL sll1 = new SLL(node1);

    System.out.println("Overloaded constructor SLL(SNode head) created a new SLL object \"sll1\".");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length: 1");
    System.out.println("Sorted Status: sorted");
    System.out.println("List Content: 6");
    System.out.println();

    // actual result displayed by print()
    System.out.println("Actual Result: ");
    sll1.print();
    System.out.println();


    // create a new SLL object by using default constructor SLL()
    SLL sll2 = new SLL();
    System.out.println();
    System.out.println("Default constructor SLL() successfully created a new SLL object \"sll2\".");
    System.out.println();

    // test insertHead(SNode node)
    sll2.insertHead(new SNode(2));
    System.out.println("insertHead(SNode node) method successfully inserted 2 to the head of \"sll2\".");

    // test insertHead(SNode node)
    sll2.insertHead(new SNode(8));
    System.out.println("insertHead(SNode node) method successfully inserted 8 to the head of \"sll2\".");

    // test insertTail(SNode node)
    sll2.insertTail(new SNode(1));
    System.out.println("insertTail(SNode node) method successfully inserted 1 to the tail of \"sll2\".");

    // test insert(SNode node, int position)
    sll2.insert(new SNode(9), 1);
    System.out.println("insert(SNode node, int position) method successfully inserted 9 to position 1 of \"sll2\".");
    System.out.println();
    
    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length: 4");
    System.out.println("Sorted Status: not sorted");
    System.out.println("List Content: 8 9 2 1");
    System.out.println();

    // actual result displayed by test()
    System.out.println("Actual Result: ");
    sll2.print();
    System.out.println();


    // test sort()
    sll2.sort();
    System.out.println();
    System.out.println("sort() method successfully sorted data in \"sll2\" in an ascending order.");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length: 4");
    System.out.println("Sorted Status: sorted");
    System.out.println("List Content: 1 2 8 9");
    System.out.println();

    // actual result displayed by test()
    System.out.println("Actual Result: ");
    sll2.print();
    System.out.println();


    // test sortedInsert(SNode node)
    SNode node2 = new SNode(4);
    System.out.println();
    System.out.println("SNode(int data) method successfully created an SNode object with data 4.");;
    sll2.sortedInsert(node2);
    System.out.println("sortedInsert(SNode node) method successfully inserted a new SNode with \"data\" 4 in a sorted order.");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length: 5");
    System.out.println("Sorted Status: sorted");
    System.out.println("List Content: 1 2 4 8 9");
    System.out.println();

    // actual result displayed by test()
    System.out.println("Actual Result: ");
    sll2.print();
    System.out.println();


    // test search(SNode node), successful case
    System.out.println();
    System.out.println("Testing search(SNode node) method by using previously created SLL object \"sll2\"...");
    System.out.println();

    SNode nodeToSearch1 = new SNode(8);
    System.out.println("SNode(int data) method successfully created an SNode object with data 8.");;

    // expected result
    System.out.print("Expected Search Result: ");
    System.out.println("Found node with value 8");
  
    // actual result
    System.out.print("Actual Search Result: ");
    SNode foundNode1 = sll2.search(nodeToSearch1);
    if (foundNode1 != null) {
        System.out.println("Found node with value " + foundNode1.getData());
    } else {
        System.out.println("Node not found");
    }


    // test search(SNode node), not successful case
    SNode nodeToSearch2 = new SNode(6);
    System.out.println();
    System.out.println("SNode(int data) method successfully created a Node object with data 6.");;

    // expected result
    System.out.print("Expected Search Result: ");
    System.out.println("Node not found");
  
    // actual result
    System.out.print("Actual Search Result: ");
    SNode foundNode2 = sll2.search(nodeToSearch2);
    if (foundNode2 != null) {
        System.out.println("Found node with value " + foundNode2.getData());
    } else {
        System.out.println("Node not found");
    }
    System.out.println();


    // test deleteHead()
    sll2.deleteHead();
    System.out.println();
    System.out.println("deleteHead() method successfully deleted the head of \"sll2\".");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length: 4");
    System.out.println("Sorted Status: sorted");
    System.out.println("List Content: 2 4 8 9");
    System.out.println();

    // actual result displayed by print()
    System.out.println("Actual Result: ");
    sll2.print();
    System.out.println();


    // test deleteTail()
    sll2.deleteTail();
    System.out.println();
    System.out.println("deleteTail() method successfully deleted the tail of \"sll2\".");
    System.out.println();

    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length: 3");
    System.out.println("Sorted Status: sorted");
    System.out.println("List Content: 2 4 8");
    System.out.println();

    // actual result displayed by print()
    System.out.println("Actual Result: ");
    sll2.print();
    System.out.println();


    // test delete(SNode node)
    SNode nodeToDelete = sll2.getHead().getNext(); 
    sll2.delete(nodeToDelete);
    System.out.println();
    System.out.println("delete(SNode node) method successfully deleted 4 from \"sll2\".");
    System.out.println();
    
    // expected result
    System.out.println("Expected Result: ");
    System.out.println("List Length: 2");
    System.out.println("Sorted Status: sorted");
    System.out.println("List Content: 2 8");
    System.out.println();

    // actual result displayed by print()
    System.out.println("Actual Result: ");
    sll2.print();
    System.out.println();


    // test clear()
    sll2.clear();
    System.out.println();
    System.out.println("clear() method successfully removed all nodes in the previously created SLL object \"sll2\".");
    System.out.println();

    // expected result
    System.out.println("Expected Result: The list is empty.");

    // actual result displaed by print()
    System.out.print("Actual Result: ");
    sll2.print();
    System.out.println();


    // end of  the test
    System.out.println();
    System.out.println("***SLL Class Testing Completed!***");
    
    }
}
