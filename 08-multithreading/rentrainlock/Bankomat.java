package rentrainlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
  
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("vasa", lock);
        new Employee("peter", lock);
        new Employee("alex", lock);
        new Employee("masha", lock);
        new Employee("sveta", lock);

    }
    
}
