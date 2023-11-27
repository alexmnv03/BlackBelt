package reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(2);
        list.add(11);
        System.out.println(list);

        int result = list.stream().reduce((accum, elem) -> accum + elem).get();
        System.out.println("Сумма всех элементов = " + result);
        result = list.stream().reduce((accum, elem) -> accum * elem).get();
        System.out.println("Произведение всех элементов = " + result);

        List<Integer> listN = new ArrayList<>();
        System.out.println("С проверкой");
        // int res = listN.stream().reduce((accum, elem) -> accum * elem).get();
        // System.out.println("С проверкой, тут получаем Exception" + res);

        Optional<Integer> resO = listN.stream().reduce((accum, elem) -> accum * elem);
        if (resO.isPresent()) {
            System.out.println("С проверкой, тут получаем Exception" + resO.get());
        } else {
            System.out.println("С проверкой, пустое значение");
        }

        int resultBeg = list.stream().reduce(1, (accum, elem) -> accum + elem);
        System.out.println("Сумма всех элементов с заданным начальным значением = " + resultBeg);

        List<String> listS = new ArrayList<>();
        listS.add("one");
        listS.add("two");
        listS.add("three");
        listS.add("four");
        listS.add("five");

        String reString = listS.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(reString);

        
    }

    
}
