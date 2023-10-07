package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import model.Student;
import parts.one.StudentInfo;

public class FunctionTest {

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


        StudentInfo info = new StudentInfo();
        Double res = avgOfSmth(list, student -> student.getAvgGrade());
        Double course = avgOfSmth(list, student -> (double)student.getCourse());
        Double age = avgOfSmth(list, student -> (double)student.getAge());

        System.out.println("midle = " + res);
        System.out.println("midle cource = " + course);
        System.out.println("midle age = " + age);
        

    }

    /**
     * Вычисляем среднее арифметическое
     * @param list
     * @param val
     * @return
     */
    private static double avgOfSmth(List<Student> list, Function<Student, Double> val) {
        Double result =  0.0;
        for(Student st: list) {
            result += val.apply(st);
        }

        result = result / list.size();
        return result;

    }
    
}
