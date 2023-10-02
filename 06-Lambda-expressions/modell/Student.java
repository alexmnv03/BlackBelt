package modell;

import java.util.Objects;

public class Student {

  private String name;
  private char sex;
  private int age;
  private int course;
  private double avgGrade;


  public Student(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public char getSex() {
    return this.sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
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

  public double getAvgGrade() {
    return this.avgGrade;
  }

  public void setAvgGrade(double avgGrade) {
    this.avgGrade = avgGrade;
  }



  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", sex='" + getSex() + "'" +
        ", age='" + getAge() + "'" +
        ", course='" + getCourse() + "'" +
        ", avgGrade='" + getAvgGrade() + "'" +
        "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return sex == student.sex &&
        age == student.age &&
        Double.compare(student.avgGrade, avgGrade) == 0 &&
        Objects.equals(name , student.name);
  }


}
