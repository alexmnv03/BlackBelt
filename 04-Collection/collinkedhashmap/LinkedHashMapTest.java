package collinkedhashmap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public abstract class LinkedHashMapTest {

    public static void main(String[] args) {
                
        LinkedHashMap<Double, Student> map = new LinkedHashMap<>();
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

        // Этот третий параметр конструктора создает порядок элементов по добавлению (default)
        LinkedHashMap<Double, Student> map1 = new LinkedHashMap<>(16, 0.75f, false);

        // Этот третий параметр конструктора создает порядок элементов по использованию, порядок будет менятся 
        // в зависимости от использования метода get - какой элемент был вызван последним методаом get, тот будет расположен 
        // последним в список
        LinkedHashMap<Double, Student> map2 = new LinkedHashMap<>(16, 0.75f, false);        


    }
    
}
