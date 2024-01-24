package rentrainlock;

import java.util.concurrent.locks.Lock;

public class EmployeeTwo extends Thread {
    
    String name;
    private Lock lock;

    public EmployeeTwo(String name, Lock lock) {
        this.lock = lock;
        this.name = name;
        this.start();   
    }
    
    public void run() {
        // Если удалось поставить замок
        if(lock.tryLock()) {
            try {
                System.out.println(name + " пользуется...");            
                Thread.sleep(2000);
                System.out.println(name + " завершил работу с банкоматом");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else { // Если не удалось поставить замок
            System.out.println(name + " не хочет ждать...");            
        }
    }    
}
