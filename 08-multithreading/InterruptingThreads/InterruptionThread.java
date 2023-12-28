package InterruptingThreads;

public class InterruptionThread extends Thread {
    double sqrtSum = 0;
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            if(interrupted()) {
                System.out.println("Поток хотят прервать");
                System.out.println("Убедимся что состояние обьекто внорме и завершим работу потока");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {                
                System.out.println("Поток хотят прервать во время сна. Завершим его работу");
            }
        }
        System.out.println(sqrtSum);
    }
    
}
