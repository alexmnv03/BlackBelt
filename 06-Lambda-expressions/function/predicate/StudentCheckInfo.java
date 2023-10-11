package function.predicate;

import java.util.List;
import java.util.function.Predicate;

import model.Student;

public class StudentCheckInfo {
    
    public void testStudents(List<Student> list, Predicate<Student> pr) {
        for(Student st: list) {
            if(pr.test(st)) {
                System.out.println(st);
            }
        }        
    }
}
