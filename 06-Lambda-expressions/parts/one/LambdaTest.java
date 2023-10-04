package parts.one;

public class LambdaTest {

    static void def(LambdaAbc lambdaAbc) {
        System.out.println(lambdaAbc.abc("Hi, how are you?"));
    }

    public static void main(String[] args) {
        def((String str) -> {return str.length();});
    }
    
}
