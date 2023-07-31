package comparator;

import java.util.Comparator;

import comparable.Employee;

public class IdComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
    
}
