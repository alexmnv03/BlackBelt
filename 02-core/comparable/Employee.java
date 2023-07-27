package comparable;

public class Employee implements Comparable<Employee> {

    public int id;
    public String name;
    public String surName;
    public int salary;


    public Employee(int id, String name, String surName, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", surName=" + surName + ", salary=" + salary + "]";
    }


    /**
     * 
     * @param obj - Object
     * @return - число, 
     *              если оно > 0 то текущий объект больше объекта o
     *              если оно < 0 то текущий объект меньше объекта o
     *              если оно == 0 то текущий объект равен объекта o
     */
    @Override
    public int compareTo(Employee o) {
        if (this.id == o.id) {
            return 0;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 1;
        }
        //Другие способы более короткие
        // return this.id - o.id;
        // return this.name.compareTo(o.name);
    }
    
        
}
