package flatmap;

import java.util.ArrayList;
import java.util.List;

import filter.Student;

public class Faculty {

    String name;
    List<Student> studentFaculty;

    public Faculty(String name) {
        this.name = name;
        studentFaculty = new ArrayList<>();
    }

    public List<Student> getStudentFaculty(){
        return studentFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentFaculty.add(st);
    }
    
}
