package ThreadPoolAndExecuterService;

public class ThreadPoolTwoHundret implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "begin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "end");
    }    
    
}
