package nameandpriority;

public class RunNameThreadTest implements Runnable {

    @Override
    public void run() {
        System.out.println("Метод run Текущий поток = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunNameThreadTest());
        thread.run();
        System.out.println("Метод main Текущий поток = " + Thread.currentThread().getName());        
        // В этом слуучаем мы увидим что у нас только один поток
        // Метод run Текущий поток = main
        // Метод main Текущий поток = main        
        // Это потому, что мы запустили run, а не start, а run запускается как обычный метод, а не новый поток
        
        // 
        System.out.println("А вот так уже будет два потока");
        thread.start();
        System.out.println("Метод main Текущий поток = " + Thread.currentThread().getName());                
        

    }
    
}
