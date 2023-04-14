package src.main.java.mylib.datastructures;

import src.main.java.mylib.datastructures.linear.QueueLL;
import src.main.java.mylib.datastructures.nodes.SNode;

public class QueueLLTest {
    public static void main(String[] args) {
        QueueLL<Integer> queue = new QueueLL<>();

        queue.enqueue(new SNode<>(1));
        queue.enqueue(new SNode<>(2));
        queue.enqueue(new SNode<>(3));
        queue.enqueue(new SNode<>(4));

        System.out.println("Queue: ");
        queue.print();

        System.out.println("Dequeue: " + queue.dequeue().getData());
        System.out.println("Dequeue: " + queue.dequeue().getData());

        System.out.println("Queue: ");
        queue.print();

        queue.enqueue(new SNode<>(5));

        System.out.print("Queue: ");
        queue.print();
    }
}
