package colqueue.priority;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(41);
        queue.add(8);
        queue.add(35);
        queue.add(7);
        queue.add(79);
        queue.add(12);
        System.out.println(queue);
        System.out.println(queue.peek());//7
        System.out.println(queue.remove());//будет выводиться удаляемый элемент
        System.out.println(queue.remove());

        PriorityQueue<Student> queueStudend = new PriorityQueue<>();
        Student st1 = new Student("st1", 1);
        Student st2 = new Student("st2", 2);
        Student st3 = new Student("st3",3);
        Student st4 = new Student("st4", 1);
        Student st5 = new Student("st5", 2);
        Student st6 = new Student("st6", 5);
        Student st7 = new Student("st7", 4);
        queueStudend.add(st1);
        queueStudend.add(st2);
        queueStudend.add(st3);
        queueStudend.add(st4);
        queueStudend.add(st5);
        queueStudend.add(st6);
        queueStudend.add(st7);
        System.out.println(queueStudend);
        System.out.println(queueStudend.peek());//1
        System.out.println("Pool");
        System.out.println(queueStudend.poll());//1
        System.out.println(queueStudend.poll());//1
        System.out.println(queueStudend.poll());//2
        System.out.println(queueStudend.poll());//2
        System.out.println(queueStudend.poll());//3
        System.out.println(queueStudend.poll());//4
        System.out.println(queueStudend.poll());//5
        System.out.println(queueStudend.poll());//null
        System.out.println(queueStudend);
                

    }
    
}
