package atomicInteger;

public class MyRunnableTest implements Runnable {
 
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerTest.increment();
        }
    }

}
