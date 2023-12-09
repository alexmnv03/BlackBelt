package callableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CollableFutureFactorial {
        private static final int Future = 0;
        static int factorialResult;

    public static void main(String[] args) {
        ExecutorService myExecutorService = Executors.newSingleThreadExecutor();
        FactorialTwo factorial = new FactorialTwo(5);
        
        Future<Integer> future =  myExecutorService.submit(factorial);
        try {
            System.out.println(future.isDone());
            System.out.println("Хотим получить результат");
            factorialResult = future.get();            
            System.out.println("получили результат");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            myExecutorService.shutdown();
        }
        System.out.println(factorialResult);
                
    }    
}
