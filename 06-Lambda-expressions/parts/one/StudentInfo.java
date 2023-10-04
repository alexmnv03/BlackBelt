package parts.one;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {

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
        
    }

    void printStudentAverGrade(List<Student> list, double avgGrade){
        for(Student st: list) {
            if(st.getAvgGrade() > avgGrade) {
                System.out.println(st);
            }
        }
    }

    void printStudentUnderAge(List<Student> list, int age){
        for(Student st: list) {
            if(st.getAge() < age) {
                System.out.println(st);
            }
        }
    }

    void printStudentMix(List<Student> list, int age, double avgGrade, char sex){
        for(Student st: list) {
            if((st.getAvgGrade() > avgGrade) && (st.getAge() > age) && (st.getSex() == sex)) {
                System.out.println(st);
            }
        }
    }

    
}
