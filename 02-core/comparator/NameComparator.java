package comparator;

import java.util.Comparator;

import comparable.Employee;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
    
}
