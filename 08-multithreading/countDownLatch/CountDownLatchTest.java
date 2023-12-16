package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everyIsReady() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("every Is Ready");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());               
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Market is open");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());               
    }        

    public static void main(String[] args) throws InterruptedException {
        new Friend("fr1", countDownLatch);
        new Friend("fr2", countDownLatch);
        new Friend("fr3", countDownLatch);
        new Friend("fr4", countDownLatch);
        new Friend("fr5", countDownLatch);
        new Friend("fr6", countDownLatch);
        new Friend("fr7", countDownLatch);

        marketStaffOnPlace();
        everyIsReady();
        openMarket();
    }
    
}
