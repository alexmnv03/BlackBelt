package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Friend extends Thread{

    String name;
    private CountDownLatch countDownLatch;
    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    
    public void run() {
        try {
            System.out.println(name + " ждет открытие магазина");
            countDownLatch.await();
            System.out.println(name + " приступил к покупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
