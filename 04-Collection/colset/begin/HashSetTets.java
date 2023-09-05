package colset.begin;

import java.util.HashSet;
import java.util.Set;

public class HashSetTets {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        System.out.println(set);
        for(String str: set) {
            System.out.println("el" + str);
        }
        set.add("five");
        set.remove("four");
        System.out.println(set);
        System.out.println(set.contains("one"));
        System.out.println(set.contains("ones"));


        Set<Integer> set2 = new HashSet<>();
        set2.add(34);
        set2.add(3);
        set2.add(27);
        set2.add(342);
        set2.add(19);
        System.out.println(set2);

        Set<Integer> set3 = new HashSet<>();
        set3.add(7);
        set3.add(3);
        set3.add(24);
        set3.add(27);

        System.out.println("Обьединим два множеста - при этом дублиаты будут удалены");
        Set<Integer> union = new HashSet<>(set2);
        union.addAll(set3);
        System.out.println(union);

        System.out.println("Пресечение двух множеств - только общие элементы");
        Set<Integer> intersect = new HashSet<>(set2);
        intersect.retainAll(set3);
        System.out.println(intersect);

        System.out.println("Разность двух множеств - из первого множества будут удалены элементы, которые есть во втором");
        Set<Integer> subtract = new HashSet<>(set2);
        subtract.removeAll(set3);
        System.out.println(subtract);

    }
    
}
