package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("p1", callBox);
        new Person("p2", callBox);
        new Person("p3", callBox);
        new Person("p4", callBox);
        new Person("p5", callBox);
    }
    
}
