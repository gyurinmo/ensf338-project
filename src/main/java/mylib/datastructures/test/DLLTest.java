package src.main.java.mylib.datastructures.test;

import src.main.java.mylib.datastructures.nodes.DNode;
import src.main.java.mylib.datastructures.linear.DLL;

public class DLLTest {
    public static void main (String[] args) {
    
        // Test DLL Class methods 
        System.out.println();
        System.out.println();
        System.out.println("***Testing DLL Class...***");


        // create a new DLL object by using overloaded constructor DLL(DNode head)
        DNode node1 = new DNode(2);
        System.out.println();
        System.out.println("DNode(int data) method successfully created a DNode object with data 2.");;
        DLL dll1 = new DLL(node1);

        System.out.println("Overloaded constructor DLL(SNode head) successfully created a new DLL object \"dll1\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 1");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 2");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual Result: ");
        dll1.print();
        System.out.println();


        // create a new DLL object by using default constructor DLL()
        DLL dll2 = new DLL();
        System.out.println();
        System.out.println("Default constructor DLL() successfully created a new DLL object \"dll2\".");
        System.out.println();

        // test insertHead(SNode node)
        dll2.insertHead(new DNode(5));
        System.out.println("insertHead(DNode node) method successfully inserted 5 to the head of \"dll2\".");

        // test insertHead(SNode node)
        dll2.insertHead(new DNode(2));
        System.out.println("insertHead(DNode node) method successfully inserted 2 to the head of \"dll2\".");

        // test insertTail(SNode node)
        dll2.insertTail(new DNode(8));
        System.out.println("insertTail(DNode node) method successfully inserted 8 to the tail of \"dll2\".");

        // test insert(SNode node, int position)
        dll2.insert(new DNode(3), 2);
        System.out.println("insert(DNode node, int position) method successfully inserted 3 to position 2 of \"dll2\".");
        System.out.println();
        
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 4");
        System.out.println("Sorted Status: not sorted");
        System.out.println("List Content: 2 5 3 8");
        System.out.println();

        // actual result displayed by test()
        System.out.println("Actual Result: ");
        dll2.print();
        System.out.println();


        // test sort()
        dll2.sort();
        System.out.println();
        System.out.println("sort() method successfully sorted data in \"dll2\" in an ascending order.");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 4");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 2 3 5 8");
        System.out.println();

        // actual result displayed by test()
        System.out.println("Actual Result: ");
        dll2.print();
        System.out.println();


        // test sortedInsert(DNode node)
        DNode node2 = new DNode(7);
        System.out.println();
        System.out.println("Node(int data) method successfully created a Node object with data 7.");;
        dll2.sortedInsert(node2);
        System.out.println("sortedInsert(Snode node) method successfully inserted a new SNode with \"data\" 7 in a sorted order.");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 5");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 2 3 5 7 8");
        System.out.println();

        // actual result displayed by test()
        System.out.println("Actual Result: ");
        dll2.print();
        System.out.println();


        // test search(SNode node), successful case
        System.out.println();
        System.out.println("Testing search(Node node) method by using previously created DLL object \"dll2\"...");
        System.out.println();

        DNode nodeToSearch1 = new DNode(5);
        System.out.println("DNode(int data) method successfully created a DNode object with data 5.");;

        // expected result
        System.out.print("Expected Search Result: ");
        System.out.println("Found node with value 5");
    
        // actual result
        System.out.print("Actual Search Result: ");
        DNode foundNode1 = dll2.search(nodeToSearch1);
        if (foundNode1 != null) {
            System.out.println("Found node with value " + foundNode1.getData());
        } else {
            System.out.println("Node not found");
        }

        
        // test search(SNode node), not successful case
        DNode nodeToSearch2 = new DNode(1);
        System.out.println();
        System.out.println("DNode(int data) method successfully created a DNode object with data 1.");;

        // expected result
        System.out.print("Expected Search Result: ");
        System.out.println("Node not found");
    
        // actual result
        System.out.print("Actual Search Result: ");
        DNode foundNode2 = dll2.search(nodeToSearch2);
        if (foundNode2 != null) {
            System.out.println("Found node with value " + foundNode2.getData());
        } else {
            System.out.println("Node not found");
        }
        System.out.println();


        // test deleteHead()
        dll2.deleteHead();
        System.out.println();
        System.out.println("deleteHead() method successfully deleted the head of \"dll2\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 4");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 3 5 7 8");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual Result: ");
        dll2.print();
        System.out.println();


        // test deleteTail()
        dll2.deleteTail();
        System.out.println();
        System.out.println("deleteTail() method successfully deleted the tail of \"dll2\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 3");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 3 5 7");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual Result: ");
        dll2.print();
        System.out.println();

        
        // test delete(DNode node)
        DNode nodeToDelete = dll2.getHead().getNext(); 
        dll2.delete(nodeToDelete);
        System.out.println();
        System.out.println("delete(DNode node) method successfully deleted 5 from \"dll2\".");
        System.out.println();
        
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("List Length: 2");
        System.out.println("Sorted Status: sorted");
        System.out.println("List Content: 3 7");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual Result: ");
        dll2.print();
        System.out.println();


        // test clear()
        dll2.clear();
        System.out.println();
        System.out.println("clear() method successfully removed all nodes in the previously created DLL object \"dll2\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: The list is empty.");

        // actual result displaed by print()
        System.out.print("Actual Result: ");
        dll2.print();
        System.out.println();


        // end of the test
        System.out.println();
        System.out.println("***DLL Class Testing Completed!***");
    
    }
}

