package flatmap;

import java.util.ArrayList;
import java.util.List;

import filter.Student;

public class FlatMapTest {

    public static void main(String[] args) {
                
        Student student1 = new Student("s1", 'm', 19, 1, 10.5);
        Student student2 = new Student("s2", 'm', 19, 2, 15.5);
        Student student3 = new Student("s3", 'm', 19, 3, 19.5);
        Student student4 = new Student("s4", 'w', 19, 1, 17.5);
        Student student5 = new Student("s5", 'w', 19, 2, 14.5);

        Faculty f1 = new Faculty("f1");
        Faculty f2 = new Faculty("f2");
        f1.addStudentToFaculty(student1);
        f1.addStudentToFaculty(student2);
        f1.addStudentToFaculty(student3);
        f2.addStudentToFaculty(student4);
        f2.addStudentToFaculty(student5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        // Вывдем имена всех студентов со всех факультетов
        facultyList.stream().flatMap(faculty->faculty.getStudentFaculty().stream())
        .forEach(el->System.out.println(el.getName()));
        
    }
    
}
