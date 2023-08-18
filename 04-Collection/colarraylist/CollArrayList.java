package colarraylist;

import java.util.ArrayList;
import java.util.List;

public class CollArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("two");        
        list.add("three");
        list.add("four");

        List<String> list1 = new ArrayList<>();
        list1.add("three");
        list1.add("four");

        for(String str: list) {
            System.out.println("str = " + str);
        }

        list.removeAll(list1);
        
        System.out.println("Удалим из списка все элементы содержащиеся в списке 2");
        for(String str: list) {
            System.out.println("str = " + str);
        } 
        list.add("three");
        list.add("four");

        list.retainAll(list1);
        System.out.println("Оставим в списке все элементы содержащиеся в списке 2");
        for(String str: list) {
            System.out.println("str = " + str);
        }         

        list.add("first");
        list.add("two");
        
        if (list.containsAll(list1)) {
            System.out.println("списк содержит все элементы содержащиеся в списке 2");
        }

        list.add("five");

        System.out.println("списк содержит все элементы начиная с 1 по 3");
        List<String> list2 = list.subList(1, 4);

        for(String str: list2) {
            System.out.println("str = " + str);
        }         

        // При этом эти два листа будут связаны, т.к. list2 это отображение list
        System.out.println("Добавим еще одни элемент в лист отображение и увидеим его в исходном листе");
        list2.add("sds");

        for(String str: list) {
            System.out.println("str = " + str);
        }         
        
        System.out.println("Преобразуем в массив");
        Object[] objects = list.toArray();
        String[] strArrays = list.toArray(new String[list.size()]);
        //или так
        String[] strArrayss = list.toArray(new String[0]);

        for(String str: strArrays) {
            System.out.println("str arr = " + str);
        }

        for(String str: strArrayss) {
            System.out.println("str arr = " + str);
        }        

        System.out.println("С помощью метода of and copyOf созадаются только неизменяемые списки и они не могут содежать значение NULL");
        List<Integer> list4 = List.of(2, 5, 7, 9, 15);

        for(Integer val: list4) {
            System.out.println("val = " + val);
        }

        System.out.println("Скопируем списк");
        List<String> list5 = List.copyOf(list);

        for(String str: list5) {
            System.out.println("str = " + str);
        }


    }
    
}
