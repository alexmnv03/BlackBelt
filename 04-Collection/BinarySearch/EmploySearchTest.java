package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Employee;

public class EmploySearchTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "emp1", 25);
        Employee emp2 = new Employee(2, "emp2", 15);
        Employee emp3 = new Employee(3, "emp3", 31);
        Employee emp4 = new Employee(4, "emp4", 43);
        Employee emp5 = new Employee(5, "emp5", 22);
        Employee emp6 = new Employee(6, "emp6", 19);
        Employee emp7 = new Employee(7, "emp7", 29);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list, new Employee(3, "ee", 25));
        System.out.println("index = " + index);
        Collections.reverse(list);
        System.out.println(list);

        
    }
    
}
