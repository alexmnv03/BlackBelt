package callableAndFuture;

import java.util.concurrent.Callable;

public class FactorialThree implements Callable<Integer> {
    int f;

    public FactorialThree (int f){
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f < 0) {
            throw new Exception ("Вы выели не верное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
