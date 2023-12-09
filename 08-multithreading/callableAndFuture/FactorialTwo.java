package callableAndFuture;

import java.util.concurrent.Callable;

public class FactorialTwo implements Callable<Integer> {

    int f;

    public FactorialTwo (int f){
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
        }
        return result;
    }
    
}
