package callableAndFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {

    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService myExecutorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        myExecutorService.execute(factorial);
        myExecutorService.shutdown();
        myExecutorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
                
    }
    
}
