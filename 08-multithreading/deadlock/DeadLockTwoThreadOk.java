package deadlock;

public class DeadLockTwoThreadOk extends Thread {

    public void run() {
        System.out.println("Thread02: попытка захватить монитор объекта lock1");
        synchronized (DeadLockTest.lock1) {
            System.out.println("Thread02: монитор объекта lock1 захвачен");
            System.out.println("Thread02: попытка захватить монитор объекта lock2");
            synchronized (DeadLockTest.lock2) {
                System.out.println("Thread02: монитор объекта lock1 и lock2 захвачены");
            }                
        }
    }    
    
}
