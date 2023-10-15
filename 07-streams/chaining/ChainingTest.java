package chaining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import filter.Student;

public class ChainingTest {

    public static void main(String[] args) {
        
        int[] array = {3, 6, 8, 15, 2, 45, 87, 5, 9};

        int result = Arrays.stream(array).filter(e-> e%2==1)
        .map(e->{
            if(e%3==0){
                e=e/3;
            }
            return e;
        })
        .reduce((a,e)->a+e).getAsInt();
        System.out.println(result);

                
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

        list.stream()
        .map(e->{
            e.setName(e.getName().toUpperCase());
            return e;
        })
        .filter(e->e.getSex()=='w')
        .sorted((x,y)->x.getAge() - y.getAge())
        .forEach(e->System.out.println(e));


        // В данном пример ы не увидим вывода, т.к. метод фильтр не будут обработан из заотсутсвтия терминального метода
        Stream<Integer> stream = Stream.of(1,2,3,5,6,8,2,4);
        stream.filter(e->{
            System.out.println("out");
            return e%2==0;
        });

        // А вот будет работать
        Stream<Integer> stream2 = Stream.of(1,2,3,5,6,8,2,4);
        stream2.filter(e->{
            System.out.println("out");
            return e%2==0;
        }).collect(Collectors.toList());

    }
    
}
