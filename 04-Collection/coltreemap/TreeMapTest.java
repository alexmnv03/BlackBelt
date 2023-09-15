package coltreemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class TreeMapTest {

    public static void main(String[] args) {
        
        TreeMap<Double, Student> map = new TreeMap<>();
        Student st1 = new Student("st1", 19, 1);
        Student st2 = new Student("st2", 23, 2);
        Student st3 = new Student("st3", 20, 3);
        Student st4 = new Student("st4", 19, 2);
        Student st5 = new Student("st5", 21, 3);
        Student st6 = new Student("st5", 21, 3);
        map.put(29.5, st1);
        map.put(23.5, st2);
        map.put(27.5, st3);
        map.put(28.5, st4);
        map.put(21.5, st5);
        System.out.println(map);
        System.out.println(map.get(23.5));
        map.remove(28.5);
        System.out.println(map);
        System.out.println("Отсортируем по убыванию");
        map.descendingMap(); // Только если базовым будет TreeMap
        System.out.println("Первый ключ " + map.firstEntry());
        System.out.println("Последний ключ " + map.lastEntry());


        // Чтобы это заработало надо имплеиентить интерфейс comparable
        TreeMap<Student, Double> map1 = new TreeMap<>();
        map1.put(st1, 29.5);
        map1.put(st2, 23.5);
        map1.put(st3, 27.5);
        // Или реализовать его сразу
        // TreeMap<Student, Double> map2 = new TreeMap<>(new compareTo<Student>(){
        //     ...
        // }
        // );

    }
    
}
