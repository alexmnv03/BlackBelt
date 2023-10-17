package collectgroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import filter.Student;

public class CollectTest {
    
    public static void main(String[] args) {
                
        Student student1 = new Student("s1", 'm', 19, 1, 10.5);
        Student student2 = new Student("s2", 'm', 19, 2, 15.5);
        Student student3 = new Student("s3", 'm', 19, 3, 19.5);
        Student student4 = new Student("s4", 'w', 19, 1, 17.5);
        Student student5 = new Student("s5", 'w', 21, 2, 14.5);
        
        List<Student> list = new ArrayList<>();
        list.add(student4);
        list.add(student1);
        list.add(student2);
        list.add(student5);
        list.add(student3);

        List<Student> list2 = new ArrayList<>();
        list2.add(student4);
        list2.add(student1);
        list2.add(student2);
        list2.add(student5);
        list2.add(student3);

                        
        System.out.println(list);
        // Группируем студентов по курсу

        Map<Integer, List<Student>> map = list.stream().map(el->{
            el.setName(el.getName().toUpperCase());
            return el;
        })
        .collect(Collectors.groupingBy(el->el.getCourse()));

        for(Map.Entry<Integer, List<Student>> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        // Разделение студентов по оценке
        Map<Boolean, List<Student>> map2 = list2.stream()
        .collect(Collectors.partitioningBy(el->el.getAvgGrade() > 7));

        for(Map.Entry<Boolean, List<Student>> entry: map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }



    }
}
