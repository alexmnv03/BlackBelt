package datarace;

public class MyRunOne implements Runnable {

    public void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");        

    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            increment();
        }
    }
    
}
