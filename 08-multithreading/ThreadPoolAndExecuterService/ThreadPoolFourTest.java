package ThreadPoolAndExecuterService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolFourTest {
        public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService myExecutorService = Executors.newScheduledThreadPool(1);
        // Поток выполниться через 3 сек и будет повторятся каждые 1 сек, пока не будет вызван метод shutdown
        // Но 1 сек это время между нашалами тасками, т.е. если таска длялась более 1 сек, то он не будет ждать, а срузу запускать без ожидания
        myExecutorService.scheduleAtFixedRate(new ThreadPoolTwoHundret(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        myExecutorService.shutdown();
        System.out.println("End Main");
    }     

}
