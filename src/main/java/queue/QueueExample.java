package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(19);
        queue.add(20);

        int removedItem = queue.remove();
        System.out.println(removedItem);

        System.out.println(queue.remove());

        System.out.println(queue.peek());

        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
