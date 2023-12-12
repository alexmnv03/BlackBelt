package concurrency;

public class ConCurrencyTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Go");
        Thread thread1 = new Thread(new MyRunOne());
        MyThredOne myThredOne = new MyThredOne();
        thread1.start();
        myThredOne.start();

        // Говорим потоку main Дождаться выполнения потока thread1
        thread1.join();
        // Говорим потоку main Дождаться выполнения потока myThredOne
        myThredOne.join();
        System.out.println("Finish");            
    }
    
}
