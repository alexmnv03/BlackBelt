package function.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.Student;

public class RemoveItTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        System.out.println("Удалим элементы, длинна которых меньше 5");
        list.removeIf(elem -> elem.length() < 5);
        System.out.println(list);
        // Другой вариант
        list.add("one");
        list.add("two");
        list.add("four");
        list.add("five");      
        System.out.println(list);  
        System.out.println("2-ой вариант - Удалим элементы, длинна которых меньше 5");
        Predicate<String> pre = elem -> elem.length() < 5;
        list.removeIf(pre);
        System.out.println(list);  
    }
    
}
