package collinkedhashmap;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int course;    

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
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
            ", age='" + getAge() + "'" +
            ", course='" + getCourse() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&                
                course == student.course &&
                Objects.equals(name , student.name);
    }
    
    /**
     * Это не лучшая реализация метода
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, course);
    }

    // @Override
    // public int hashCode() {
    //     return name.length() * 7 + age * 11 + course * 31;
    // }

    
}
