package threadCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionTwoSinxroTest {
    
        public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> source = new ArrayList<>();       
        for (int i = 0; i < 1000; i++) {
            source.add(i);            
        }        
        List<Integer> syncList = Collections.synchronizedList(source);
        Runnable runnable = () -> {
            synchronized(syncList) {
                Iterator<Integer> iterator = syncList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());         
                }                
            }      
        };
        Runnable runnableTwo = () -> syncList.remove(10);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnableTwo);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(syncList);

    }    
}
