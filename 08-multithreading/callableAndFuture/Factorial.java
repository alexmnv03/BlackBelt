package callableAndFuture;

public class Factorial implements Runnable {

    int f;

    public Factorial (int f){
        this.f = f;
    }

    @Override
    public void run() {
        if (f < 0) {
            System.out.println("Вы выели не верное число");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;            
        }
        RunnableFactorial.factorialResult = result;
    }
    
}
