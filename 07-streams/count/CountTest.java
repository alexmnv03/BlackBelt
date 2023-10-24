package count;

import java.util.stream.Stream;

public class CountTest {
    

    public static void main(String[] args) {
                
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 5, 1, 12, 3, 23, 12, 9);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 5, 1, 12, 3, 23, 12, 9);
        
        System.out.println(stream1.count());
        System.out.println(stream2.distinct().count());
    }
}
