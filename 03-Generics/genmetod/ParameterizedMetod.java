package genmetod;

import java.util.ArrayList;

import genclass.Doublet;

public abstract class ParameterizedMetod {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(27);
        int val = GenMetod.getSecondElement(list);
        System.out.println(val);

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("zero");
        listStr.add("one");
        listStr.add("two");
        String str = GenMetod.getSecondElement(listStr);
        System.out.println(str);     
        
        Doublet<Integer> doublet = new Doublet<>(21, 57);
        System.out.println(doublet);
        Integer vals = 15;
        System.out.println("abc = " + doublet.abc(vals));
        System.out.println("abcd = " + doublet.abcd(35));
        System.out.println("abcd = " + doublet.abcd(35.9));
        System.out.println("abcd = " + doublet.abcd("abcd"));
        
    }

}
