package ThreadPoolAndExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolFirstTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService myExecutorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            myExecutorService.execute(new ThreadPoolHundret());            
        }
        myExecutorService.shutdown();
        myExecutorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("End Main");
    }
    
}
