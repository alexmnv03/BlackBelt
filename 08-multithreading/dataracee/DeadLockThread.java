package deadlock;

public class DeadLockThread extends Thread{

    public void run() {
        System.out.println("Thread01: попытка захватить монитор объекта lock1");
        synchronized (DeadLockTest.lock1) {
            System.out.println("Thread01: монитор объекта lock1 захвачен");
            System.out.println("Thread01: попытка захватить монитор объекта lock2");
            synchronized (DeadLockTest.lock2) {
                System.out.println("Thread01: монитор объекта lock1 and lock2 захвачены");
            }
                
        }
    }
    
}
