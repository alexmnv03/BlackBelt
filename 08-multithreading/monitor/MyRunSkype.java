package monitor;

public class MyRunSkype implements Runnable{
    
    @Override
    public void run() {
        // new SynchronizeblockThree().skypeCall();
        new SynchronizeblockThree().skypeCallBlock();

    }    
}
