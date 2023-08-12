package wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcastTest {

    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();
        list1.add(15.6);
        list1.add(25.1);
        list1.add(19.3);
        showList(list1);
        

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        showList(list2);

        // А вот так делать нельзя
        List<?> list3 = new ArrayList<String>();
        //list3.add("ddssd"); error

        List<? extends Number> list4 = new ArrayList<Integer>();

        List<? super Number> list6 = new ArrayList<Object>();
                
        ArrayList<Double> list5 = new ArrayList<>();
        list5.add(15.6);
        list5.add(25.1);
        list5.add(19.3);

        System.out.println("sum list = " + sum(list5));

        
    }

    public static void showList(List<?> list) {
        System.out.println("my list " + list);
    }

    public static Double sum(ArrayList<? extends Number> list) {
        double sum = 0;
        for(Number n: list) {
            sum += n.doubleValue();
        }
        return sum;
    }
    
}
