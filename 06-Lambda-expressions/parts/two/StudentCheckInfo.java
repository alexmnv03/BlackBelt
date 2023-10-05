package parts.two;

import java.util.List;

import parts.one.Student;

public class StudentCheckInfo {
    
    public void testStudents(List<Student> list, StudentChecks sc) {
        for(Student st: list) {
            if(sc.check(st)) {
                System.out.println(st);
            }
        }        
    }
}
