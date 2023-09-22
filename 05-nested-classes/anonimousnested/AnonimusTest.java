package anonimousnested;

public class AnonimusTest {
    private int val = 5;

    public static void main(String[] args) {

        
        
        class Sum implements Math{
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        // Тоже самое, но используем анонимный класс
        Math m1 = new Math() {
            int a =10;
            void abc(){a=15;}// Можно добалять все что разрешено обычным классам
            @Override
            public int doOperation(int a, int b) {
                AnonimusTest anonimusTest = new AnonimusTest();
                return a + b + anonimusTest.val;
            }            
        };
        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }            
        };        

        MathC mc = new MathC() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }            
        };                

        Sum sum = new Sum();
        System.out.println(sum.doOperation(5,3));
        System.out.println(m1.doOperation(7,9));
        System.out.println(m2.doOperation(7,9));
        System.out.println(mc.doOperation(7,9));

    }
    
}
