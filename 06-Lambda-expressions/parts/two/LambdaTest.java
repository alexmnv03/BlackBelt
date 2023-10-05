package parts.two;

public class LambdaTest {

    static void def(LambdaAbc lambdaAbc) {
        System.out.println(lambdaAbc.abc("Hi, how are you?"));
    }

    public static void main(String[] args) {
        int val = 10;
        //val = 25; так деалть нельзя, поэтому лучше сразу указывать final
        def((String str) -> {
            int dif = 15;
            return str.length() + val + dif;});
    }
    
}
