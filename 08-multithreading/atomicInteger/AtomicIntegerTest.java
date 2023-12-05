package atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    
    static AtomicInteger concurrent = new AtomicInteger(0);

    public static void increment () {
        concurrent.incrementAndGet();
        //concurrent.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableTest());
        Thread thread2 = new Thread(new MyRunnableTest());
        Thread thread3 = new Thread(new MyRunnableTest());
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(concurrent);
    }
}
