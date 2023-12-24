package deadlock;

public class DeadLockTest {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadLockThread thread1 = new DeadLockThread();
        DeadLockTwoThread thread2 = new DeadLockTwoThread();
        DeadLockTwoThreadOk thread2Ok = new DeadLockTwoThreadOk();
        thread1.start();
        thread2.start();
    }
    
}
