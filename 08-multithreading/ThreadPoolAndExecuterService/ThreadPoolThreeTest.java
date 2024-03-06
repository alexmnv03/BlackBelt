package ThreadPoolAndExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolThreeTest {

        public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService myExecutorService = Executors.newScheduledThreadPool(1);
        // Поток выполниться через 3 сек
        myExecutorService.schedule(new ThreadPoolTwoHundret(), 3, TimeUnit.SECONDS);

        myExecutorService.shutdown();
        System.out.println("End Main");
    }    
    
}
