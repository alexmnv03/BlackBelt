package datarace;

public class MyRunTwo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            CounterTwo.increment();            
        }
    }
    
}
