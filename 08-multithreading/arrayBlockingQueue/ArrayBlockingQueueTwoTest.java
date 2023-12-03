package arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueTwoTest {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        // Producer
        new Thread(()-> {
            int i = 0;
            while (true) {
                try {
                    queue.put(++i);
                    System.out.println("Producer add " + i + " queue = " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        ).start();

        // Consumer
        new Thread(()-> {
            while (true) {
                try {
                    Integer j = queue.take();
                    System.out.println("Producer get " + j);                    
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        ).start();;
        
    }
    
}
