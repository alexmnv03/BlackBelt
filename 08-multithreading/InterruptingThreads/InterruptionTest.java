package InterruptingThreads;

public class InterruptionTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Start");
        InterruptionThread myThread = new InterruptionThread();
        myThread.start();
        myThread.sleep(2000);
        //myThread.stop();
        myThread.interrupt();

        myThread.join();

        System.out.println("Main End");
    }
    
}
