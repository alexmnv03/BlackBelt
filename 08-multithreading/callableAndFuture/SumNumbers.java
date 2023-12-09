package callableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumNumbers {

    private static long value = 1_000_000_000l;
    private static long sum = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService myExecutorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResult = new ArrayList<>();
        long valueDelivery10 = value / 10;
        for (int i = 0; i < 10; i++) {
            long from = valueDelivery10 * i  + 1;
            long to = valueDelivery10 * (i + 1);                    
            PartitionSum task = new PartitionSum(from, to);
            Future<Long> futurePartSum = myExecutorService.submit(task);
            futureResult.add(futurePartSum);
        }
        for(Future<Long> result : futureResult) {
            sum += result.get();
        }
        myExecutorService.shutdown();
        System.out.println("Total sum = " + sum);        
    }
    
}
