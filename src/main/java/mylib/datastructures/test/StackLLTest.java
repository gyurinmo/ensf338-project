package src.main.java.mylib.datastructures.test;

import src.main.java.mylib.datastructures.linear.StackLL;
import src.main.java.mylib.datastructures.nodes.SNode;

public class StackLLTest {
    public static void main (String[] args) {

        // Test StackLL Class methods 
        System.out.println();
        System.out.println();
        System.out.println("***Testing StackLL Class...***");
    

        // create a new StackLL object by using overloaded constructor StackLL(SNode head)
        SNode head = new SNode(5);
        System.out.println();
        System.out.println("SNode(int data) method successfully created a SNode object with data 5.");;       
        StackLL stack1 = new StackLL(head);
        
        System.out.println("Overloaded constructor StackLL(SNode head) created a new StackLL object \"stack1\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("Stack size: 1");
        System.out.println("Sorted Status: sorted");
        System.out.println("Stack content (top to bottom): 5");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual Result: ");
        stack1.print();
        System.out.println();    


        // test peek() method
        stack1.peek();
        System.out.println();
        System.out.println("peek() successfully returned head value of previosuly crated StackLL object \"stack1\".");
        System.out.println();

        // expected result
        System.out.println("Expected head: 5");

        // actual result displayed by print()
        System.out.print("Actual head: ");
        System.out.println(stack1.peek());
        System.out.println();


        // create a new StackLL object by using default constructor StackLL()
        StackLL stack2 = new StackLL();
        System.out.println();
        System.out.println("Default constructor StackLL() successfully created a new StackLL object \"stack2\".");
        System.out.println();
    
        // test inherited insertHead(SNode node) method from SLL class via push(SNode node) method
        stack2.push(new SNode(3));
        System.out.println("push(SNode node) method successfully inserted 3 to the top of \"stack2\".");

        stack2.push(new SNode(1));
        System.out.println("push(SNode node) method successfully inserted 1 to the top of \"stack2\".");

        stack2.push(new SNode(9));
        System.out.println("push(SNode node) method successfully inserted 9 to the top of \"stack2\".");

        // expected result
        System.out.println();
        System.out.println("Expected Result: ");
        System.out.println("Stack size: 3");
        System.out.println("Sorted Status: not sorted");
        System.out.println("Stack content (top to bottom): 9 1 3");
        System.out.println();

        // actual result displayed by test()
        System.out.println("Actual Result: ");
        stack2.print();
        System.out.println();


        // test inherited sort() method from SLL class
        stack2.sort();
        System.out.println();
        System.out.println("sort() method successfully sorted contents in \"stack2\" in an ascending order.");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("Stack size: 3");
        System.out.println("Sorted Status: sorted");
        System.out.println("Stack content (top to bottom): 1 3 9");
        System.out.println();

        // actual result displayed by test()
        System.out.println("Actual Result: ");
        stack2.print();
        System.out.println();


        // test sortedPush(SNode node)
        SNode node1 = new SNode(7);
        System.out.println();
        System.out.println("SNode(int data) method successfully created a SNode object with data 7.");;
        stack2.sortedPush(node1);
        System.out.println("sortedPush(SNode node) method successfully inserted a new SNode with \"data\" 7 in a sorted order.");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("Stack size: 4");
        System.out.println("Sorted Status: sorted");
        System.out.println("Stack content (top to bottom): 1 3 7 9");
        System.out.println();

        // actual result displayed by test()
        System.out.println("Actual Result: ");
        stack2.print();
        System.out.println();


        // test inherited search(SNode node) from SLL calss, successful case
        System.out.println();
        System.out.println("Testing search(SNode node) method by using previously created StackLL object \"stack2\"...");
        System.out.println();

        SNode nodeToSearch1 = new SNode(3);
        System.out.println("SNode(int data) method successfully created a SNode object with data 3.");;

        // expected result
        System.out.print("Expected Search Result: ");
        System.out.println("Found node with value 3");
    
        // actual result
        System.out.print("Actual Search Result: ");
        SNode foundNode1 = stack2.search(nodeToSearch1);
        if (foundNode1 != null) {
            System.out.println("Found node with value " + foundNode1.getData());
        } else {
            System.out.println("Node not found");
        }


        // test inherited search(SNode node) from SLL calss, not successful case
        SNode nodeToSearch2 = new SNode(6);
        System.out.println();
        System.out.println("SNode(int data) method successfully created a Node object with data 6.");;

        // expected result
        System.out.print("Expected Search Result: ");
        System.out.println("Node not found");
    
        // actual result
        System.out.print("Actual Search Result: ");
        SNode foundNode2 = stack2.search(nodeToSearch2);
        if (foundNode2 != null) {
            System.out.println("Found node with value " + foundNode2.getData());
        } else {
            System.out.println("Node not found");
        }
        System.out.println();


        // test inherited deleteHead() method from SLL via pop() method
        stack2.pop();
        System.out.println();
        System.out.println("pop() method successfully removed the head of \"stack2\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("Stack Length: 3");
        System.out.println("Sorted Status: sorted");
        System.out.println("Stack Content (top to bottom): 3 7 9");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual Result: ");
        stack2.print();
        System.out.println();


        // test delete(DNode node)
        SNode nodeToDelete = stack2.getHead().getNext(); 
        stack2.delete(nodeToDelete);
        System.out.println();
        System.out.println("delete(SNode node) method successfully removed 7 from \"stack2\".");
        System.out.println();
        
        // expected result
        System.out.println("Expected Result: ");
        System.out.println("Stack Length: 2");
        System.out.println("Sorted Status: sorted");
        System.out.println("Stack Content (top to bottom): 3 9");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual Result: ");
        stack2.print();
        System.out.println();


        // test inherited clear() method from SLL class
        stack2.clear();
        System.out.println();
        System.out.println("clear() method successfully removed all contents in the previously created StackLL object \"stack2\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: The list is empty.");

        // actual result displaed by print()
        System.out.print("Actual Result: ");
        stack2.print();
        System.out.println();

        // end of  the test
        System.out.println();
        System.out.println("***StackLL Class Testing Completed!***");
    }
}
