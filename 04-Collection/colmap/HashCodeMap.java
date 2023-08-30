package colmap;

import java.util.HashMap;
import java.util.Map;

public class HashCodeMap {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("st1", 19, 1);
        Student st2 = new Student("st2", 23, 2);
        Student st3 = new Student("st3", 20, 3);
        Student st4 = new Student("st4", 19, 2);
        Student st5 = new Student("st5", 21, 3);
        Student st6 = new Student("st5", 21, 3);
        map.put(st1, 29.5);
        map.put(st2, 23.5);
        map.put(st3, 27.5);
        map.put(st4, 28.5);
        map.put(st5, 23.5);
        System.out.println(map);

        boolean result = map.containsKey(st6);
        // Мы видим, что такой студент не найден, несмотря на то что переопредел  equals
        // переопределим hashcode
        System.out.println("Studend find : " + result);

        System.out.println("Чему равн hashCode : " + st1.hashCode());
        System.out.println("Чему равн hashCode : " + st2.hashCode());


    }
    
}
