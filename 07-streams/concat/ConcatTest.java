package concat;

import java.util.stream.Stream;

public class ConcatTest {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 3, 2);
        Stream<Integer> stream3 = Stream.of(3, 12, 23, 34, 9);
        Stream<Integer> stream4 = Stream.concat(stream1, stream3);
        stream4.forEach(System.out::println);

    }
    
}
