package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(23);
        list.add(39);
        list.add(312);
        list.add(-3);
        list.add(83);
        list.add(-43);
        list.add(331);
        list.add(-123);
        Collections.sort(list);
        int index = Collections.binarySearch(list, 23);
        System.out.println("index = " + index);
    }
    
}
