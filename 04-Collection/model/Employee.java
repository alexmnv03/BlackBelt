package model;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int salary;


    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }  

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", salary='" + getSalary() + "'" +
            "}";
    }


    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
    
}
