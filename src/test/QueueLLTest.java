package src.test;

import src.main.java.mylib.datastructures.linear.QueueLL;
import src.main.java.mylib.datastructures.nodes.SNode;

public class QueueLLTest {
    public static void main(String[] args) {
        
        // Test QueueLL Class methods 
        System.out.println();
        System.out.println();
        System.out.println("***Testing QueueLL Class...***");
    

        // create a new QueueLL object by using overloaded constructor QueueLL(SNode head)
        SNode head = new SNode(5);
        System.out.println();
        System.out.println("SNode(int data) method successfully created a SNode object with data 5.");;       
        QueueLL queue1 = new QueueLL(head);
        
        System.out.println("Overloaded constructor QueueLL(SNode head) created a new QueueLL object \"queue1\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("Queue size: 1");
        System.out.println("Queuecontent (front to rear): 5");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual head: ");
        queue1.print();
        System.out.println();    


        // test peek() method
        queue1.peek();
        System.out.println();
        System.out.println("peek() successfully returned head value of previosuly crated QueueLL object \"queue1\".");
        System.out.println();

        // expected result
        System.out.println("Expected head: 5");

        // actual result displayed by print()
        System.out.print("Actual Result: ");
        System.out.println(queue1.peek());
        System.out.println();


        // create a new QueueLL object by using default constructor QueueLL()
        QueueLL queue2 = new QueueLL();
        System.out.println();
        System.out.println("Default constructor QueueLL() successfully created a new QueueLL object \"queue2\".");
        System.out.println();
    
        // test inherited insertTail(SNode node) method from SLL class via enqueue(SNode node) method
        queue2.enqueue(new SNode(3));
        System.out.println("enqueue(SNode node) method successfully inserted 3 to the bottom of \"queue2\".");

        queue2.enqueue(new SNode(1));
        System.out.println("enqueue(SNode node) method successfully inserted 1 to the bottom of \"queue2\".");

        queue2.enqueue(new SNode(9));
        System.out.println("enqueue(SNode node) method successfully inserted 9 to the bottom of \"queue2\".");
       
        queue2.enqueue(new SNode(5));
        System.out.println("enqueue(SNode node) method successfully inserted 5 to the bottom of \"queue2\".");
       
        // expected result
        System.out.println();
        System.out.println("Expected Result: ");
        System.out.println("Queue size: 4");
        System.out.println("Queue content (front to rear): 3 1 9 5");
        System.out.println();

        // actual result displayed by test()
        System.out.println("Actual Result: ");
        queue2.print();
        System.out.println();

        // test inherited search(SNode node) from SLL calss, successful case
        System.out.println();
        System.out.println("Testing search(SNode node) method by using previously created QueueLL object \"queue2\"...");
        System.out.println();

        SNode nodeToSearch1 = new SNode(3);
        System.out.println("SNode(int data) method successfully created a SNode object with data 3.");;

        // expected result
        System.out.print("Expected Search Result: ");
        System.out.println("Found node with value 3");
    
        // actual result
        System.out.print("Actual Search Result: ");
        SNode foundNode1 = queue2.search(nodeToSearch1);
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
        SNode foundNode2 = queue2.search(nodeToSearch2);
        if (foundNode2 != null) {
            System.out.println("Found node with value " + foundNode2.getData());
        } else {
            System.out.println("Node not found");
        }
        System.out.println();


        // test inherited deleteHead() method from SLL via dequeue() method
        queue2.dequeue();
        System.out.println();
        System.out.println("dequeue() method successfully deleted the head of \"queue2\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: ");
        System.out.println("Queue size: 3");
        System.out.println("Queue Content (front to rear): 1 9 5");
        System.out.println();

        // actual result displayed by print()
        System.out.println("Actual Result: ");
        queue2.print();
        System.out.println();

        
        // test inherited clear() method from SLL class
        queue2.clear();
        System.out.println();
        System.out.println("clear() method successfully removed all contents in the previously created QueueLL object \"queue2\".");
        System.out.println();

        // expected result
        System.out.println("Expected Result: The list is empty.");

        // actual result displaed by print()
        System.out.print("Actual Result: ");
        queue2.print();
        System.out.println();


        // end of  the test
        System.out.println();
        System.out.println("***QueueLL Class Testing Completed!***");
    }

}
