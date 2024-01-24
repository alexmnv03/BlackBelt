package rentrainlock;

import java.util.concurrent.locks.Lock;

public class Employee extends Thread {

    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.lock = lock;
        this.name = name;
        this.start();   
    }
    
    public void run() {
        try {
            System.out.println(name + " жджет...");
            lock.lock();
            System.out.println(name + " пользуется...");            
            Thread.sleep(2000);
            System.out.println(name + " завершил работу с банкоматом");
        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
