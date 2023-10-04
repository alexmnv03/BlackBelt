package parts.one;

import java.util.List;

public class StudentCheckInfo {
    
    public void testStudents(List<Student> list, StudentChecks sc) {
        for(Student st: list) {
            if(sc.check(st)) {
                System.out.println(st);
            }
        }        
    }
}
