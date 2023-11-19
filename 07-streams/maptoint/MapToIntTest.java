package maptoint;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import filter.Student;

public class MapToIntTest {
    
    public static void main(String[] args) {
                        
        Student student1 = new Student("s1", 'm', 19, 1, 10.5);
        Student student2 = new Student("s2", 'm', 15, 2, 15.5);
        Student student3 = new Student("s3", 'm', 25, 3, 19.5);
        Student student4 = new Student("s4", 'w', 19, 1, 17.5);
        Student student5 = new Student("s5", 'w', 21, 2, 14.5);
        
        List<Student> list = new ArrayList<>();
        list.add(student4);
        list.add(student1);
        list.add(student2);
        list.add(student5);
        list.add(student3);

        List<Integer> courses = list.stream()
        .mapToInt(el->el.getCourse())
        .boxed()
        .collect(Collectors.toList());

        System.out.println(courses);
        

        List<Double> avges = list.stream()
        .mapToDouble(el->el.getAvgGrade())
        .boxed()
        .collect(Collectors.toList());

        System.out.println(avges);

        Integer sumCourses = list.stream()
        .mapToInt(el->el.getCourse())        
        .sum();
        
        System.out.println(sumCourses);


        Double average = list.stream()
        .mapToInt(el->el.getCourse())        
        .average().getAsDouble();
        
        System.out.println(average);

        Integer minCourses = list.stream()
        .mapToInt(el->el.getCourse())        
        .min().getAsInt();
        
        System.out.println(minCourses);
        
        Integer maxCourses = list.stream()
        .mapToInt(el->el.getCourse())        
        .max().getAsInt();
        
        System.out.println(maxCourses);        

    }
}
