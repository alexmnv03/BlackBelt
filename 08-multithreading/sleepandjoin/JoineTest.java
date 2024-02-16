package sleepandjoin;

public class JoineTest {

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
        
        System.out.println("Work start");
        Thread thread2 = new Thread(new Worker());
        thread2.start();
        thread2.join(1500);
        System.out.println("Main Finish"); 

        System.out.println("Рассмотрим все состояния потоков"); 

        Thread thread3 = new Thread(new Worker());
        System.out.println(thread3.getState());
        thread3.start();
        System.out.println(thread3.getState()); 
        thread3.join();
        System.out.println(thread3.getState()); 

        System.out.println("Main Finish ----"); 

    }
    
}
