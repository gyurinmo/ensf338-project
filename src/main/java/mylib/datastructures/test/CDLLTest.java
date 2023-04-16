package src.main.java.mylib.datastructures.test;

import src.main.java.mylib.datastructures.linear.CDLL;
import src.main.java.mylib.datastructures.nodes.DNode;

public class CDLLTest {
    public static void main (String[] args) {
    
        // Test CDLL Class methods 
        System.out.println();
        System.out.println();
        System.out.println("***Testing CDLL Class...***");
        System.out.println();
    
    
        // create a new CDLL object by using overloaded constructor CDLL(DNode head) which calls DLL(DNode node)
        CDLL cdll1 = new CDLL(new DNode(6));
    
        System.out.println("Overloaded constructor CDLL(DNode head) created a new CDLL object \"cdll1\".");
        System.out.println();
    
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("Size of cdll1: 1"); 
        System.out.println("Value of head node of cdll1: 6"); 
        System.out.println("Value of tail node of cdll1: 6"); 
        System.out.println();
    
        // actual result 
        System.out.println("Actual Result: ");
        System.out.println("Size of cdll1: " + cdll1.getSize()); 
        System.out.println("Value of head node of cdll1: " + cdll1.getHead().getData());
        System.out.println("Value of tail node of cdll1: " + cdll1.getTail().getData());
        System.out.println();
    
    
        // create a new CDLL object by using default constructor CDLL()
        CDLL cdll2 = new CDLL();
        System.out.println();
        System.out.println("Default constructor CDLL() successfully created a new CDLL object \"cdll2\".");
        System.out.println();
    
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("Size of cdll2: 0"); 
        System.out.println("Value of head node of cdll2: null"); 
        System.out.println("Value of tail node of cdll2: null"); 
        System.out.println();
    
        // actual result
        System.out.println("Actual Result: ");
        System.out.println("Size of cdll2: " + cdll2.getSize()); 
        System.out.println("Value of head node of cdll2: " + cdll2.getHead());
        System.out.println("Value of tail node of cdll2: " + cdll2.getTail());
        System.out.println();
        System.out.println();
    

        // test intereted and modified insertHead(DNode node) method from DLL class
        cdll2.insertHead(new DNode(3));
        System.out.println("insertHead(DNode node) method successfully inserted 3 to the head of \"cdll2\".");
    
        // test inherited and modified insertHead(DNode node) method from DLL class
        cdll2.insertHead(new DNode(8));
        System.out.println("insertHead(DNode node) method successfully inserted 8 to the head of \"cdll2\".");
    
        // test inherited and modified insertTail(DNode node) method from DLL class
        cdll2.insertTail(new DNode(5));
        System.out.println("insertTail(DNode node) method successfully inserted 5 to the tail of \"cdll2\".");
    
        // test inherited and modified insert(DNode node, int position) method from DLL class
        cdll2.insert(new DNode(1), 1);
        System.out.println("insert(DNode node, int position) method successfully inserted 1 to position 1 of \"cdll2\".");
        System.out.println();
        
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 4");
        System.out.println("Sorted Status: not sorted");
        System.out.println("List Content: 8 1 3 5");
        System.out.println();
    
        // actual result displayed by test()
        System.out.println("Actual Result: ");
        cdll2.print();
        System.out.println();
    
    
        // test inherited and modified sort() method from DLL class
        cdll2.sort();
        System.out.println();
        System.out.println("sort() method successfully sorted data in \"cdll2\" in an ascending order.");
        System.out.println();
    
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 4");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 1 3 5 8");
        System.out.println();
    
        // actual result displayed by test()
        System.out.println("Actual Result: ");
        cdll2.print();
        System.out.println();
    
    
        // test inherited and modified sortedInsert(DNode node) method from DLL class
        DNode node2 = new DNode(6);
        System.out.println();
        System.out.println("DNode(int data) method successfully created a DNode object with data 6.");;
        cdll2.sortedInsert(node2);
        System.out.println("sortedInsert(DNode node) method successfully inserted a new DNode with \"data\" 6 in a sorted order.");
        System.out.println();
    
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 5");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 1 3 5 6 8");
        System.out.println();
    
        // actual result displayed by test()
        System.out.println("Actual Result: ");
        cdll2.print();
        System.out.println();
    
    
        // test inherited and modified search(DNode node) method from DLL class, successful case
        System.out.println();
        System.out.println("Testing search(DNode node) method by using previously created DLL object \"cdll2\"...");
        System.out.println();
    
        DNode nodeToSearch1 = new DNode(3);
        System.out.println("DNode(int data) method successfully created a DNode object with data 3.");;
    
        // expected result
        System.out.print("Expected Search Result: ");
        System.out.println("Found node with value 3");
      
        // actual result
        System.out.print("Actual Search Result: ");
        DNode foundNode1 = cdll2.search(nodeToSearch1);
        if (foundNode1 != null) {
            System.out.println("Found node with value " + foundNode1.getData());
        } else {
            System.out.println("Node not found");
        }
    

        // test inherited and modified search(DNode node) method from DLL class, not successful case
        DNode nodeToSearch2 = new DNode(9);
        System.out.println();
        System.out.println("Node(int data) method successfully created a Node object with data 9.");;
    
        // expected result
        System.out.print("Expected Search Result: ");
        System.out.println("Node not found");
      
        // actual result
        System.out.print("Actual Search Result: ");
        DNode foundNode2 = cdll2.search(nodeToSearch2);
        if (foundNode2 != null) {
            System.out.println("Found node with value " + foundNode2.getData());
        } else {
            System.out.println("Node not found");
        }
        System.out.println();
    

        // test inherited and modified deleteHead() method from DLL class
        cdll2.deleteHead();
        System.out.println();
        System.out.println("deleteHead() method successfully deleted the head of \"cdll2\".");
        System.out.println();
    
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 4");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 3 5 6 8");
        System.out.println();
    
        // actual result displayed by print()
        System.out.println("Actual Result: ");
        cdll2.print();
        System.out.println();
    
    
        // test inherited and modified deleteTail() method from DLL class
        cdll2.deleteTail();
        System.out.println();
        System.out.println("deleteTail() method successfully deleted the tail of \"cdll2\".");
        System.out.println();
    
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 3");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 3 5 6");
        System.out.println();
    
        // actual result displayed by print()
        System.out.println("Actual Result: ");
        cdll2.print();
        System.out.println();
    
        
        // test delete(DNode node)
        DNode nodeToDelete = cdll2.getHead().getNext(); 
        cdll2.delete(nodeToDelete);
        System.out.println();
        System.out.println("delete(DNode node) method successfully deleted 5 from \"cdll2\".");
        System.out.println();
        
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 2");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 3 6");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual Result: ");
        cdll2.print();
        System.out.println();


        // test inherited and modified clear() method from DLL class
        cdll2.clear();
        System.out.println();
        System.out.println("clear() method successfully removed all nodes in the previously created SLL object \"cdll2\".");
        System.out.println();
    
        // expected result
        System.out.println("Expected Result: The list is empty.");

        // actual result displaed by print()
        System.out.print("Actual Result: ");
        cdll2.print();
        System.out.println();
    

        // end of  the test
        System.out.println();
        System.out.println("***CDLL Class Testing Completed!***");
        
        }
    }
    