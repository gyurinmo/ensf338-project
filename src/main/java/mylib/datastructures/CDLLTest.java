package src.main.java.mylib.datastructures;


import src.main.java.mylib.datastructures.linear.CDLL;
import src.main.java.mylib.datastructures.nodes.DNode;

public class CDLLTest {

    public static void main(String[] args) {
        CDLL<Integer> list = new CDLL<>();

        DNode<Integer> node1 = new DNode<>(1);
        DNode<Integer> node2 = new DNode<>(2);
        DNode<Integer> node3 = new DNode<>(3);

        list.insertHead(node1);
        list.insertTail(node2);
        list.insert(node3, 1);

        System.out.println("List after adding nodes:");
        printList(list);
        
        list.deleteHead();
        list.deleteTail();
        
        System.out.println("List after deleting nodes:");
        printList(list);

    }

    private static void printList(CDLL<Integer> list) {
        DNode<Integer> node = list.getHead().getNext();
        while (node != list.getTail()) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

}
