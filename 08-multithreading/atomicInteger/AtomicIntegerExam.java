package atomicInteger;

public class AtomicIntegerExam {

    static int concurrent = 0;

    public synchronized static void increment () {
        concurrent++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableExam());
        Thread thread2 = new Thread(new MyRunnableExam());
        Thread thread3 = new Thread(new MyRunnableExam());
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(concurrent);
    }
    
}
