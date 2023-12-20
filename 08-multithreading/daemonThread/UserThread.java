package daemonThread;

public class UserThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + 
            "is Daemon " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
    
}
