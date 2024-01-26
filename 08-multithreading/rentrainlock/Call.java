package rentrainlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Call {

    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call start");
            Thread.sleep(3000);
            System.out.println("Mobile call end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("skype call start");
            Thread.sleep(5000);
            System.out.println("skype call end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }    

    void wathAppCall() {
        lock.lock();
        try {
            System.out.println("wathApp call start");
            Thread.sleep(3000);
            System.out.println("wathApp call end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }    
    
}
