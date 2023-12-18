package cuncurrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class CuncurrentHashMapCunTest {
    
    public static void main(String[] args) throws InterruptedException {
        
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "mp1");
        map.put(2, "mp2");
        map.put(3, "mp3");
        map.put(4, "mp4");
        map.put(5, "mp5");
        System.out.println(map);

        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));                
            }
        };
        Runnable runnableTwo = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "mp6");
        };
       

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnableTwo);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);        
    }    

}
