package colset.coltreeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(51);
        set.add(527);
        set.add(21);
        set.add(176);
        set.add(15);
        System.out.println(set);
        //set.add(null); //Error

        set.remove(51);
        System.out.println(set);
        System.out.println(set.contains(51));

        TreeSet<Student> set2 = new TreeSet<>();
        Student st1 = new Student("st1", 1);
        Student st2 = new Student("st2", 2);
        Student st3 = new Student("st3",3);
        Student st4 = new Student("st4", 1);
        Student st5 = new Student("st5", 2);
        Student st6 = new Student("st6", 4);
        Student st7 = new Student("st7", 4);
        set2.add(st1);
        set2.add(st2);
        set2.add(st3);
        set2.add(st4);
        System.out.println("Мы видим только три студента, т.к. дубликаты запрещены");
        System.out.println(set2);
        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println("Выведем студентов которые учатся на курсе как и st5 или ниже");
        System.out.println(set2.headSet(st5));
        System.out.println("Выведем студентов которые учатся на курсе как ниже st6 и выше st5");
        System.out.println(set2.subSet(st5, st6));

        System.out.println(st6.equals(st7));
        System.out.println(st6.hashCode() == st7.hashCode());

    }
    
}
