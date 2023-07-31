package comparator;

import java.util.Comparator;

import comparable.Employee;

public class SalaryComparator implements Comparator<Employee> {
    
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }

}
