package ThreadPoolAndExecuterService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolFiveTest {
        public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService myExecutorService = Executors.newScheduledThreadPool(1);
        // Поток выполниться через 3 сек и будет повторятся каждые 1 сек, пока не будет вызван метод shutdown
        // Но теперь 1 сек это время между тасками, т.е. не зависимо от длительности таски, он  будет ждать 1 сек после завершения таски, 
        //и только псоле этого запустит следующую таску        
        myExecutorService.scheduleWithFixedDelay(new ThreadPoolTwoHundret(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        myExecutorService.shutdown();
        System.out.println("End Main");
    }         
}
