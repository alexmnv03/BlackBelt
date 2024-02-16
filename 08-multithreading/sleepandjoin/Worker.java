package sleepandjoin;

public class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begin");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work finish");


    }
    
}
