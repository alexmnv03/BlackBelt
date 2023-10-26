package distinct;

import java.util.stream.Stream;

public class DistinctTest {

    public static void main(String[] args) {
        
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 5, 1, 12, 3, 23, 12, 9);
        
        stream1.distinct().forEach(System.out::println);

    }
    
}
