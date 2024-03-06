package ThreadPoolAndExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSixTest {
        public static void main(String[] args) throws InterruptedException {
        ExecutorService myExecutorService = Executors.newCachedThreadPool();

        Thread.sleep(20000);
        myExecutorService.shutdown();
        System.out.println("End Main");
    }             
}
