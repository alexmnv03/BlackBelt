package threadCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class SynchronizedCollectionTwoTest {
    
        public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            source.add(i);            
        }        
        Runnable runnable = () -> {
            Iterator<Integer> iterator = source.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());                
            }
        };
        Runnable runnableTwo = () -> source.remove(10);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnableTwo);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(source);

    }
}
