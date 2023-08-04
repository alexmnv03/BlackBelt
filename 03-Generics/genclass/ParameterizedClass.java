package genclass;

public class ParameterizedClass {
    
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hi");
        System.out.println(info1);
        String str = info1.getValue();
        Info<Integer> info2 = new Info<>(35);
        System.out.println(info2);
        
        Pair<String, Integer> pair1 = new Pair<>("str", 25);
        System.out.println(pair1);

        Pair<Integer, Double> pair2 = new Pair<>(51, 25.0);
        System.out.println(pair2);
        
        Doublet<String> doublet = new Doublet<>("Hi", "Vasy");
        System.out.println(doublet);        
    }
}
