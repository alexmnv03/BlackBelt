package limit;

import java.util.ArrayList;
import java.util.List;

import filter.Student;

public class LimitTest {

    public static void main(String[] args) {
                        
        Student student1 = new Student("s1", 'm', 19, 1, 10.5);
        Student student2 = new Student("s2", 'm', 15, 2, 15.5);
        Student student3 = new Student("s3", 'm', 25, 3, 19.5);
        Student student4 = new Student("s4", 'w', 19, 1, 17.5);
        Student student5 = new Student("s5", 'w', 21, 2, 14.5);
        
        List<Student> list = new ArrayList<>();
        list.add(student4);
        list.add(student1);
        list.add(student2);
        list.add(student5);
        list.add(student3);

        list.stream().filter(el->el.getAge()>17).limit(2)
        .forEach(e->System.out.println(e));

    }
    
}
