package coldeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);// add в начало
        deque.addFirst(39);// add в начало
        deque.addLast(9);// add в конец
        deque.addLast(6);// add в конец

        deque.offerFirst(93);// add в начало без Exeption
        deque.offerFirst(253);// add в начало без Exeption
        deque.offerLast(21);// add в конец без Exeption
        deque.offerLast(21);// add в конец без Exeption
        System.out.println(deque);
        
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekLast());
        System.out.println(deque.peekFirst());
        System.out.println("remove");
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println(deque.pop());// возвращает элемент с вершины и удаляет его
        System.out.println(deque);

    }
    
}
