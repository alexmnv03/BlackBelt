package colqueue.begin;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("four");
        queue.add("five");
        queue.add("six");
        System.out.println(queue);
        queue.remove();
        System.out.println("удалили первый элемент" + queue);
        System.out.println("первый элемент в очереди: " + queue.element());
        queue.remove();
        System.out.println("первый элемент в очереди: " + queue.element());
        queue.remove("five");
        System.out.println(queue);

    }
    
}
