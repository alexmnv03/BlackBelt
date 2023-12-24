package datarace;

public class CounterTwo {
    static int count = 0;
    public static void increment() {count++;};
    
    public static void main(String[] args) throws InterruptedException {
        MyRunTwo myRunOTwo = new MyRunTwo();
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
