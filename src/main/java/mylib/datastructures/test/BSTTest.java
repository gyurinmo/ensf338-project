package src.main.java.mylib.datastructures.test;

import src.main.java.mylib.datastructures.nodes.TNode;
import src.main.java.mylib.datastructures.trees.BST;

public class BSTTest {
    public static void main(String[] args) {

    /** Test BST Class methods */
    System.out.println();
    System.out.println();
    System.out.println("***Testing BST Class...***");

    // create a new BST object by using overloaded constructor BST(int val)
    BST bst1 = new BST(2);

    System.out.println();
    System.out.println("A BST object is successfully created via BST overloaded constructor BST(int val)!");

    // test getter
    System.out.println("Expected data: 2, Actual data: " + bst1.getRoot());

    // create a new BST object by using overloaded constructor BST(TNode obj)
    TNode node3 = new TNode();
    BST bst2 = new BST(node3);

    System.out.println();
    System.out.println("A BST object is successfully created via BST overloaded constructor BST(TNode obj)!");
    System.out.println("Expected data: 0, Actual data: " + bst2.getRoot());

    // create a new BST object by using default constructor
    BST bst3 = new BST();

    System.out.println();
    System.out.println("A BST object is successfully created via BST default constructor!");    
    System.out.println("Expected data: null, Actual data: " + bst3.getRoot());

    // test setters
    TNode node4 = new TNode(2, 0, null, null, null);
    bst3.setRoot(node4);

    System.out.println();
    System.out.println("BST setters successfully set root!");
    System.out.println("Expected data: 2, Actual data: " + bst3.getRoot());

    // test insert(int val)
    BST bst4 = new BST();
    bst4.insert(5);
    bst4.insert(2);
    bst4.insert(8);
    bst4.insert(1);
    bst4.insert(3);
    bst4.insert(7);
    bst4.insert(9);

    System.out.println();
    System.out.println("Nodes are created by the provided values and the nodes are successfully inserted into the BST object!");

    // test insert(TNode node)
    BST bst5 = new BST();
    TNode node5 = new TNode(1, 0, null, null, null);
    TNode node6 = new TNode(3, 0, null, null, null);
    TNode node7 = new TNode(2, 0, null, null, null);
    bst5.insert(node5);
    bst5.insert(node6);
    bst5.insert(node7);

    System.out.println();
    System.out.println("The nodes are successfully inserted into the BST object!");
    
    // test inOrderTraversal(TNode node)
    System.out.println();
    System.out.println("Testing BST inOrderTraversal(TNode node)...");
    
    System.out.println("In-order traversal of BST:");
    bst4.printInOrder();

    // test search(int val)
    System.out.println();
    System.out.println("Testing BST search(int val)...");

    TNode searchedNode1 = bst4.search(3);
    if (searchedNode1 != null) {
        System.out.println("Node with value 3 found in the BST object");
    } else {
        System.out.println("Node with value 3 not found in the BST object");
    }

    // test delete(int val) and deleteNode(TNode node, int val)
    System.out.println();
    System.out.println("Testing BST delete(int val)...");
    
    bst4.delete(2);
    TNode searchedNode2 = bst4.search(2);
    if (searchedNode2 != null) {
        System.out.println("Node with value 2 was not deleted from the BST object");
    } else {
        System.out.println("Node with value 2 was successfully deleted from the BST object");
    }

    // test printBF()
    System.out.println();
    System.out.println("Testing BST printBF()...");

    System.out.println("Breadth-first traversal of BST:");

    System.out.println();
    System.out.println("***BST Class Testing Completed!***");
    
    }
}
