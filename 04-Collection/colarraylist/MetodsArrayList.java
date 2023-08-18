package colarraylist;

import java.util.ArrayList;
import java.util.List;

public class MetodsArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("two");        
        list.add("three");
        list.add(0, "one"); // при этом список сдвигается
        list.add(3, "four");
        list.set(1, "one"); // а это замена
        list.set(0, "start");
        //list.add(7, "four"); //error
        System.out.println(list);
        for(String str: list) {
            System.out.println("str = " + str);
        }
        System.out.println("str 3 = " + list.get(3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("str fori = " + list.get(i));            
        }
        list.remove(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("fnl str fori = " + list.get(i));            
        }

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        list.addAll(list1);
        System.out.println("Добавим другой список");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("str fori = " + list.get(i));            
        }        

        list.addAll(2, list1);
        System.out.println("Добавим другой список со второй позиции");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("str fori = " + list.get(i));
        }

        int number = list.indexOf("3");
        System.out.println("Позиция искомого объекта = " + number);

        // Очистка листа
        list1.clear();
        
        if (list1.isEmpty()) {
            System.out.println("Список пустой");
        }

        if (list.contains("3")) {
            System.out.println("Список содержит объект 3");
        }

    }
    
}
