package monitor;

public class SynchronizeblockTwo {
    
    volatile static int count = 0;   
    public static synchronized void incrementOne() {
        count++;
    }
        
    public static void incrementTwo() {
        synchronized(SynchronizeblockTwo.class) {
            count++;
        }
    }

    public static void main(String[] args) {
        MyRunOne myRunOne = new MyRunOne();
        Thread myThreadOne = new Thread(myRunOne);
        Thread myThreadTwo = new Thread(myRunOne);
        Thread myThreadThree = new Thread(myRunOne);
        myThreadOne.start();
        myThreadTwo.start();
        myThreadThree.start();
    }

}
