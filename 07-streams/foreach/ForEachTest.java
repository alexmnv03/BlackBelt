package foreach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import filter.Student;

public class ForEachTest {

    public static void main(String[] args) {
        int[] array = {5, 6, 2, 8, 3};
        Arrays.stream(array).forEach(elem->System.out.println(elem));        
        System.out.println("Другая запись используя ссылку на метод");
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::myMetod);

        System.out.println("Вносим изменения");
        Arrays.stream(array).forEach(elem->{
            elem *= 2;
            System.out.println(elem);
        }
        
        );
        System.out.println("Создадим Stream с нуля");
        Student student1 = new Student("s1", 'm', 19, 1, 10.5);
        Student student2 = new Student("s2", 'm', 19, 2, 15.5);
        Student student3 = new Student("s3", 'm', 19, 3, 19.5);
        Student student4 = new Student("s4", 'w', 19, 1, 17.5);
        Student student5 = new Student("s5", 'w', 19, 2, 14.5);
        Stream<Student> myStream = Stream.of(student1, student2, student3, student4, student5);
        List<Student> listFilter = myStream.filter(elem->elem.getAge() > 15 && elem.getAvgGrade() < 14.0 
        ).collect(Collectors.toList());
        System.out.println(listFilter);
    }
    
}

