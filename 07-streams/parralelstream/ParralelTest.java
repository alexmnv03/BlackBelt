package parralelstream;

import java.util.ArrayList;
import java.util.List;

public class ParralelTest {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.4);
        list.add(210.4);
        list.add(17.9);
        list.add(19.1);
        list.add(35.4);
        list.add(49.2);
        list.add(97.5);

        Double result = list.stream()
        .reduce((accum, elem)-> accum + elem).get();
        System.out.println(result); 

        Double resultPara = list.parallelStream()
        .reduce((accum, elem)-> accum + elem).get();
        System.out.println(resultPara);         

        Double div = list.stream()
        .reduce((accum, elem)-> accum / elem).get();
        System.out.println(div); 


        // А вот так уже работать будет не корректно
        Double divPara = list.parallelStream()
        .reduce((accum, elem)-> accum / elem).get();
        System.out.println(divPara);                 

    }
    
}
