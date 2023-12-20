package daemonThread;

public class DaemonThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + 
            "is Daemon " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }    
    
}
