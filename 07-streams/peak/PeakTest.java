package peak;

import java.util.stream.Stream;

public class PeakTest {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 5, 1, 12, 3, 23, 12, 9);
        // В данном примере мыотображаем какие элементы у нас будут учавствовать в сумме
        System.out.println(stream1.distinct().peek(System.out::println).count());
    }
    
}
