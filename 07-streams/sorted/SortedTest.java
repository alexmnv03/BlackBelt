package sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import filter.Student;

public class SortedTest {
    public static void main(String[] args) {
        
        int[] array = {3, 6, 9, 1, 8, 2};
        int[] arrayOut =  Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(arrayOut));

        Student student1 = new Student("s1", 'm', 19, 1, 10.5);
        Student student2 = new Student("s2", 'm', 19, 2, 15.5);
        Student student3 = new Student("s3", 'm', 19, 3, 19.5);
        Student student4 = new Student("s4", 'w', 19, 1, 17.5);
        Student student5 = new Student("s5", 'w', 19, 2, 14.5);
        
        List<Student> list = new ArrayList<>();
        list.add(student4);
        list.add(student1);
        list.add(student2);
        list.add(student5);
        list.add(student3);
                
        // Обязательно нужен метод сравнения
        List<Student> sortlist = list.stream().sorted((x, y)->
        x.getName().compareTo(y.getName())
        )
        .collect(Collectors.toList());

        System.out.println(sortlist);

    }
    
}
