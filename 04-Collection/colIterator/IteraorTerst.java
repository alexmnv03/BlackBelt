package colIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteraorTerst {

    public static void main(String[] args) {
                
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("two");        
        list.add("three");
        list.add("four");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String str = iterator.next();
            System.out.println("next = " + str);
            if (str.equals("two")) {
                iterator.remove();
            }
        }

        System.out.println("Удалим одни элемент");
        for(String str: list) {
            System.out.println("str = " + str);
        }         
    }
    
}
