package function.consumer;

import java.util.ArrayList;
import java.util.List;

public class ForEachMain {

    public static void main(String[] args) {
        List<String> list = List.of("Hi", "how are you", "Ok", "By");
        for(String str: list) {
            System.out.println(str);
        }
        list.forEach(str -> System.out.println(str)
        );
        System.out.println("Example 2");


        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(el ->  {
            System.out.println(el);
            el *= 2;
            System.out.println(el);
        });

    }
    
}
