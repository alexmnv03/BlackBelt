package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MapTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list);

        // Заменим эти поля их значнием длинны
        // Как мы это могли бы сделать
        for (int i = 0; i < list.size(); i++) {
            //list.set(i, String.valueOf(list.get(i).length()));            
        }
        System.out.println(list);

        // Сделаем тоже самое, но используя Srteam
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5, 8, 9, 2, 3};
        int[] array2 = Arrays.stream(array).map(element->
        {
            if(element % 3 == 0){  
                element = element / 3;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array2));
    
        System.out.println("set  -----");
        Set<String> set = new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        System.out.println(set);

        Set<Integer> set2 = set.stream().map(elem->elem.length()).collect(Collectors.toSet());

        System.out.println(set2);

        List<Integer> list3 = set.stream().map(elem->elem.length()).collect(Collectors.toList());
        System.out.println(list3);

    }
    
}
