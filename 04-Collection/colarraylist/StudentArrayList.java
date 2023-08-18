package colarraylist;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentArrayList {

    public static void main(String[] args) {
        Student student1 = new Student("s1", 'm', 19, 1, 10.5);
        Student student2 = new Student("s2", 'm', 19, 2, 15.5);
        Student student3 = new Student("s3", 'm', 19, 3, 19.5);
        Student student4 = new Student("s4", 'w', 19, 1, 17.5);
        Student student5 = new Student("s5", 'w', 19, 2, 14.5);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        System.out.println(list);
        Student student6 = new Student("s5", 'w', 19, 2, 14.5);        
        list.remove(student6);
        System.out.println(list);
        // Тут мы видим что s5 не удалился, т.к. это разные объекты, и чтобы удалить его нам надо переопределить 
        //метод equals в классе Student и тогда он будет удален
        
        int index = list.indexOf(student3);
        System.out.println("Позиция искомого объекта 3 = " + index);
        index = list.indexOf(student6);
        System.out.println("Позиция искомого объекта 6 = " + index);

        list.add(student6);
        index = list.lastIndexOf(student6);
        System.out.println("Позиция искомого объекта 6 = " + index);        

    }
    
}
