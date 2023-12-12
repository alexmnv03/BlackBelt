package concurrency;

public class MyThredOne extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);                            
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);            
        }
    }    
}
