package copyOfWriteArraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class OldArraylistTest {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        Runnable runnable = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnableTwo = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            list.remove(4);
            list.add("seven");
        };        

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnableTwo);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);        
    }
    
}
