package ThreadPoolAndExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTwoTest {
        public static void main(String[] args) throws InterruptedException {
        ExecutorService myExecutorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            myExecutorService.execute(new ThreadPoolHundret());            
        }
        myExecutorService.shutdown();
        // System.out.println("End Main");
    }
}
