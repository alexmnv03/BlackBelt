package rentrainlock;

public class LockTest {

    public static void main(String[] args) {

        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }            
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }            
        });        
        
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.wathAppCall();
            }            
        });     
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}
