package model;
import java.util.Objects;

public class StudentSmall {

    private String name;
    private int course;    

    public StudentSmall(String name, int course) {
        this.name = name;
        this.course = course;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", course='" + getCourse() + "'" +
            "}";
    }
    
}
