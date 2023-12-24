package deadlock;

public class DeadLockTwoThread extends Thread{
 
    public void run() {
        System.out.println("Thread02: попытка захватить монитор объекта lock2");
        synchronized (DeadLockTest.lock2) {
            System.out.println("Thread02: монитор объекта lock2 захвачен");
            System.out.println("Thread02: попытка захватить монитор объекта lock1");
            synchronized (DeadLockTest.lock1) {
                System.out.println("Thread02: монитор объекта lock1 и lock2 захвачены");
            }                
        }
    }

}
