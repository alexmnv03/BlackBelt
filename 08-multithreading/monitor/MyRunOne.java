package monitor;

public class MyRunOne implements Runnable {

    public synchronized void doWorkOne() {
        CounterOne.count++;
        System.out.println(CounterOne.count);
    }

    public void doWorkTwo() {
        doWorkThree();
        // Явно указываем монитор для который будет использован для синхронизации
        synchronized(this) {
            CounterOne.count++;
            System.out.println(CounterOne.count);
        }
    }    

    public void doWorkThree() {
        System.out.println("doWorkThree");
    }    


    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            // doWorkOne();
            doWorkTwo();
        }
    }
    
}
