package src.test;

import src.main.java.mylib.datastructures.nodes.TNode;
import src.main.java.mylib.datastructures.trees.AVL;

public class AVLTest {
    public static void main(String[] args) {

    // Test AVL Class methods
    System.out.println();
    System.out.println();
    System.out.println("***Testing AVL Class...***");
    
    // create a new AVL object by using overloaded constructor AVL(int val)
    AVL avl1 = new AVL(2);

    System.out.println();
    System.out.println("An AVL object is successfully created via AVL overloaded constructor AVL(int val)!");

    // test getter
    System.out.println("Expected data: 2, Actual data: " + avl1.getRoot());

    // create a new AVL object by using overloaded constructor AVL(TNode obj)
    TNode node8 = new TNode();
    AVL avl2 = new AVL(node8);

    System.out.println();
    System.out.println("An AVL object is successfully created via AVL overloaded constructor AVL(TNode obj)!");
    System.out.println("Expected data: 0, Actual data: " + avl2.getRoot());

    // create a new AVL object by using default constructor
    AVL avl3 = new AVL();

    System.out.println();
    System.out.println("An AVL object is successfully created via AVL default constructor!");    
    System.out.println("Expected data: null, Actual data: " + avl3.getRoot());

    // test setters
    TNode node9 = new TNode(2, 0, null, null, null);
    avl3.setRoot(node9);

    System.out.println();
    System.out.println("AVL setters successfully set root!");
    System.out.println("Expected data: 2, Actual data: " + avl3.getRoot());

    // test insert(int val)
    AVL avl4 = new AVL();
    avl4.insert(5);
    avl4.insert(2);
    avl4.insert(6);
    avl4.insert(1);
    avl4.insert(3);
    avl4.insert(7);
    avl4.insert(4);

    System.out.println();
    System.out.println("Nodes are created by the provided values and the nodes are successfully inserted into the AVL object!");

    // test insert(TNode node)
    AVL avl5 = new AVL();
    TNode node10 = new TNode(8, 0, null, null, null);
    TNode node11 = new TNode(10, 0, null, null, null);
    TNode node12 = new TNode(9, 0, null, null, null);
    avl5.insert(node10);
    avl5.insert(node11);
    avl5.insert(node12);

    System.out.println();
    System.out.println("The nodes are successfully inserted into the AVL object!");

    // test inherited method inOrderTraversal(TNode node) from BST class
    System.out.println();
    System.out.println("Testing inherited method inOrderTraversal(TNode node) from BST class...");
    
    System.out.println("In-order traversal of AVL object:");
    avl5.printInOrder();

    // test inherited method search(int val) from BST class
    System.out.println();
    System.out.println("Testing inherited method search(int val) from BST class...");

    TNode searchedNode3 = avl4.search(3);
    if (searchedNode3 != null) {
        System.out.println("Node with value 3 found in the AVL object");
    } else {
        System.out.println("Node with value 3 not found in the AVL object");
    }

    // test delete(int val)
    System.out.println();
    System.out.println("Testing AVL delete(int val)...");
    
    avl4.delete(6);
    TNode searchedNode4 = avl4.search(6);
    if (searchedNode4 != null) {
        System.out.println("Node with value 6 was not deleted from the AVL object");
    } else {
        System.out.println("Node with value 6 was successfully deleted from the AVL object");
    }

    // test inherited method printBF() from AVL class
    System.out.println();
    System.out.println("Testing inherited method printBF() from AVL class...");

    System.out.println("Breadth-first traversal of AVL object:");
    avl4.printBF();
 
    // end of the test
    System.out.println();
    System.out.println("***AVL Class Testing Completed!***");
    
    }
}
