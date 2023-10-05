package parts.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import parts.one.Student;
import parts.one.StudentInfo;

public class StudentInfoTest {
    public static void main(String[] args) {
        Student student1 = new Student("s1", 'm', 21, 1, 10.5);
        Student student2 = new Student("s2", 'm', 23, 2, 15.5);
        Student student3 = new Student("s3", 'm', 27, 3, 19.5);
        Student student4 = new Student("s4", 'w', 19, 1, 17.5);
        Student student5 = new Student("s5", 'w', 24, 2, 14.5);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        StudentCheckInfo infoCheck = new StudentCheckInfo();
        System.out.println("Age");

        infoCheck.testStudents(list, (Student student) -> {
                return student.getAge() > 21;
            });

        System.out.println("New example");
        infoCheck.testStudents(list, student -> {
                return student.getAge() > 21;
            });            

        System.out.println("New New example");
        infoCheck.testStudents(list, student -> 
                student.getAge() > 21
            );

        System.out.println("используем лямбда не как параметр метода");
        // В данном примере показано как можно использовать лямбда-выражение несколько раз
        StudentChecks sc = (Student student)-> student.getAge() > 21;
        infoCheck.testStudents(list, sc);
        
        System.out.println("Отсортируем студентов в списке");
        System.out.println("Используем анонимынй класс");
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
            
        });
        System.out.println(list);

        System.out.println("Используем люмбда и сортировка по возрасту");
        Collections.sort(list, (st1, st2) -> st1.getAge() - st2.getAge());
        System.out.println(list);

    }
    
}
