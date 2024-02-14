package semaphore;

import java.util.concurrent.Semaphore;

public class Person extends Thread {

    String name;
    private Semaphore callBox;

    public Person (String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run () {        
        try {
            System.out.println(name + " ждет телефон...");
            callBox.acquire();
            System.out.println(name + " звонит по телефону");
            sleep(2000);
            System.out.println(name + " завершил звонок");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
    
}
