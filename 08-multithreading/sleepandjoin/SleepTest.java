package sleepandjoin;

public class SleepTest {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);            
        }
        System.out.println("Go");
        Thread thread1 = new Thread(new MyRunOne());
        MyThredOne myThredOne = new MyThredOne();
        thread1.start();
        myThredOne.start();
        System.out.println("Finish");
    }
    
}
