package colset.coltreeset;

import java.util.Objects;

public class Student implements Comparable<Student>{
    
    private String name;
    private int course;

    public Student(String name, int course) {
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
    public int compareTo(Student o) {
        return this.course - o.course;
    }
    
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", course='" + getCourse() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }
    
    /**
     * Это не лучшая реализация метода
     */
    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

}

