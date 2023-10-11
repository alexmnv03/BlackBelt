package function.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.Student;
import parts.one.StudentInfo;

public class PredicateTest {

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
        System.out.println(list);

        System.out.println("Aplay Predicate");
        StudentCheckInfo infoCheck = new StudentCheckInfo();        
        infoCheck.testStudents(list, (Student st) -> {
            return st.getAvgGrade() > 15;
        });

        Predicate<Student> pre1 = student -> student.getAvgGrade() > 15;
        Predicate<Student> pre2 = student -> student.getSex() == 'm';

        System.out.println("first");
        infoCheck.testStudents(list, pre1);
        System.out.println("next");
        infoCheck.testStudents(list, pre2);
        System.out.println("union");
        infoCheck.testStudents(list, pre1.and(pre2));
        System.out.println("все у кого совпадает хотя бы одно условие");
        infoCheck.testStudents(list, pre1.or(pre2));

        // Объединим эти два фильтра в один
    }
    
}
