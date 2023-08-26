package collinkedlist;

import java.util.LinkedList;
import java.util.List;

import model.StudentSmall;

public class LinkListTest {

    public static void main(String[] args) {
        StudentSmall student1 = new StudentSmall("s1", 1);
        StudentSmall student2 = new StudentSmall("s2", 2);
        StudentSmall student3 = new StudentSmall("s3", 3);
        StudentSmall student4 = new StudentSmall("s4", 1);
        StudentSmall student5 = new StudentSmall("s5", 2);
        List<StudentSmall> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student4);
        linkedList.add(student5);

        System.out.println(linkedList);
        System.out.println("two = " + linkedList.get(2));
        StudentSmall student6 = new StudentSmall("s6", 2);
        StudentSmall student7 = new StudentSmall("s7", 3);
        linkedList.add(student6);
        linkedList.add(0, student7);
        System.out.println(linkedList);
        linkedList.remove(6);
        System.out.println(linkedList);

    }

}
