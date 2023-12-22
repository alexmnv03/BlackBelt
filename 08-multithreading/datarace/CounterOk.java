package datarace;

public class CounterOk {

    volatile static int count = 0;
    public static synchronized void increment() {count++;};
    
    public static void main(String[] args) throws InterruptedException {
        MyRunThree myRunOTwo = new MyRunThree();
        Thread myThreadOne = new Thread(myRunOTwo);
        Thread myThreadTwo = new Thread(myRunOTwo);
        Thread myThreadThree = new Thread(myRunOTwo);
        myThreadOne.start();

        myThreadTwo.start();
        myThreadOne.join();
        myThreadTwo.join();
                        

        // myThreadThree.start();
        System.out.println(count);
    }            
    
}
