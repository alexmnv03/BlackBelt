package parts.one;

import java.util.ArrayList;
import java.util.List;

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
        StudentInfo info = new StudentInfo();
        System.out.println("printStudentAverGrade");
        info.printStudentAverGrade(list, 15);
        System.out.println("printStudentUnderAge");
        info.printStudentUnderAge(list, 23);
        System.out.println("printStudentMix");
        info.printStudentMix(list, 23, 17, 'm');

        System.out.println("Change for interface");
        System.out.println("First version");
        StudentCheckInfo infoCheck = new StudentCheckInfo();
        infoCheck.testStudents(list, new CheckAverGrade());
        System.out.println("Use anonimus class");
        infoCheck.testStudents(list, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.getAvgGrade() > 15;
            }
        });
        System.out.println("Use Lambda-expressions");
        infoCheck.testStudents(list, (Student student) -> {
                return student.getAvgGrade() > 16;
            });
        System.out.println("Age");
        infoCheck.testStudents(list, (Student student) -> {
                return student.getAge() > 21;
            });

        System.out.println("Mix");
        infoCheck.testStudents(list, (Student student) -> {
                return student.getAge() > 21 && student.getAvgGrade() > 15 && student.getSex() == 'm';
            });


        

    }
    
}
