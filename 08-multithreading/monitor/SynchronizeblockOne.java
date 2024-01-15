package monitor;

public class SynchronizeblockOne {
    
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
