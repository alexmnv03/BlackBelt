package atomicInteger;

public class MyRunnableExam implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerExam.increment();
        }
    }
    
}
