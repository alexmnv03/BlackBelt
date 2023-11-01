package findfirst;

import java.util.ArrayList;
import java.util.List;

import filter.Student;

public class FindFirstTest {
    
    public static void main(String[] args) {
                        
        Student student1 = new Student("s1", 'm', 19, 1, 10.5);
        Student student2 = new Student("s2", 'm', 19, 2, 15.5);
        Student student3 = new Student("s3", 'm', 19, 3, 19.5);
        Student student4 = new Student("s4", 'w', 19, 1, 17.5);
        Student student5 = new Student("s5", 'w', 21, 2, 14.5);
        
        List<Student> list = new ArrayList<>();
        list.add(student4);
        list.add(student1);
        list.add(student2);
        list.add(student5);
        list.add(student3);


        Student stFirst = list.stream()
        .map(e->{
            e.setName(e.getName().toUpperCase());
            return e;
        })
        .filter(e->e.getSex()=='w')
        .sorted((x,y)->x.getAge() - y.getAge())
        .findFirst().get();

        System.out.println(stFirst);


    }
}
