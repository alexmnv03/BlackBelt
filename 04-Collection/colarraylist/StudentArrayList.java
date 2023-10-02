package colarraylist;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {

    public static void main(String[] args) {
        Studentt student1 = new Studentt("s1", 'm', 19, 1, 10.5);
        Studentt student2 = new Studentt("s2", 'm', 19, 2, 15.5);
        Studentt student3 = new Studentt("s3", 'm', 19, 3, 19.5);
        Studentt student4 = new Studentt("s4", 'w', 19, 1, 17.5);
        Studentt student5 = new Studentt("s5", 'w', 19, 2, 14.5);
        List<Studentt> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        System.out.println(list);
        Studentt student6 = new Studentt("s5", 'w', 19, 2, 14.5);
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
