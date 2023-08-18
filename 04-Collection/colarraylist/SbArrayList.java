package colarraylist;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class SbArrayList {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);

        for(StringBuilder str: list) {
            System.out.println("str = " + str);
        }
        //list.add(sb1); //error - мы не можем менять длинну этого списка

        array[0].append("E");
        System.out.println(list);
        array[0] = new StringBuilder("F");
        System.out.println(list);

    }
    
}
