package monitor;

public class SynchronizeblockThree {
    
    // Создадим любой объект
    static final Car car = new Car();

    static final Object lock = new Object();

    // Все запускается одновременно и работает без синхронизации
    // Так не работает, т.к. мы видим по this, что совершенно разные и полэтому мониторы тоже будут разные
    // А нам необходимо, чтобы синхронизация шла по одному объекту
    synchronized void mobileCall()  {
        System.out.println(this);
        System.out.println("Mobile call start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Mobile call end");
    }

    synchronized void skypeCall()  {
        System.out.println(this);
        System.out.println("skype call start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("skype call end");
    }    

    synchronized void wathappCall()  {
        System.out.println(this);
        System.out.println("wathapp call start");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("wathapp call end");
    }    

    //Поэтому используем для этого одни объект и блоки    

    void mobileCallBlock()  {
        synchronized (car){
            System.out.println("Mobile call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Mobile call end");
        }        
    }

    void skypeCallBlock()  {
        synchronized (car){
            System.out.println("skype call start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("skype call end");
        }
    }        

    synchronized void wathappCallBlock()  {
        synchronized (car){
            System.out.println("wathapp call start");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("wathapp call end");
        }
    }        
    
// Вариант без создания дополнительного класса

    void mobileCallLock()  {
        synchronized (lock){
            System.out.println("Mobile call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Mobile call end");
        }        
    }

    void skypeCallLock()  {
        synchronized (lock){
            System.out.println("skype call start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("skype call end");
        }
    }        

    synchronized void wathappCallLock()  {
        synchronized (lock){
            System.out.println("wathapp call start");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("wathapp call end");
        }
    }            

public static void main(String[] args) {
    Thread thread1 = new Thread(new MyRunMobile());
    Thread thread2 = new Thread(new MyRunSkype());
    Thread thread3 = new Thread(new MyRunWhatApp());
    // thread1.start();
    // thread2.start();
    // thread3.start();

    System.out.println("Рабочий вариант");

    Thread threadB1 = new Thread(new MyRunMobile());
    Thread threadB2 = new Thread(new MyRunSkype());
    Thread threadB3 = new Thread(new MyRunWhatApp());
    threadB1.start();
    threadB2.start();
    threadB3.start();    
}    
}
