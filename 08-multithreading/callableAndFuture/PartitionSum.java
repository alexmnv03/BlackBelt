package callableAndFuture;

import java.util.concurrent.Callable;

public class PartitionSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartitionSum (long from, long to) {
        this.from = from;
        this.to = to;
    }

    public Long call() {
        for (long i = 0; i <= to; i++) {
            localSum += i;            
        }
        System.out.println("Sum from " + from + " to " + " = " + localSum);
        return localSum;
    }
   
}
