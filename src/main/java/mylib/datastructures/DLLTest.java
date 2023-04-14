package src.main.java.mylib.datastructures;

import src.main.java.mylib.datastructures.nodes.DNode;
import src.main.java.mylib.datastructures.linear.DLL;

public class DLLTest {
    public static void main(String[] args) {
        DLL<String> dll = new DLL<>();

        dll.insertHead(new DNode<>("A"));
        dll.insertTail(new DNode<>("B"));
        dll.print();

        dll.insert(new DNode<>("C"), 1);
        dll.print();

        dll.sortedInsert(new DNode<>("E"));
        dll.sortedInsert(new DNode<>("D"));
        dll.print();

        DNode<String> node = dll.search(new DNode<>("D"));
        System.out.println(node.getData());

        dll.delete(new DNode<>("C"));
        dll.print();

        dll.sort();
        dll.print();

        dll.clear();
        dll.print();
    }

}
