package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableObjTest {

    public static void main(String[] argv) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "alex", "dif", 905);
        Employee emp2 = new Employee(15, "serg", "hert", 379);
        Employee emp3 = new Employee(9, "zank", "vetm", 578);
        
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("before sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("afer sort");
        System.out.println(list);
        
    }    
    
}
