package rentrainlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankomatTwo {
    
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new EmployeeTwo("vasa", lock);
        new EmployeeTwo("peter", lock);
        new EmployeeTwo("alex", lock);
        Thread.sleep(3000);
        new EmployeeTwo("masha", lock);
        new EmployeeTwo("sveta", lock);

    }    
}
