package subtyping;

import java.util.ArrayList;
import java.util.List;

public class SubTypingTest {

    public static void main(String[] args) {
        X x = new Y();
        // Так не работает
        //List<X> list1 = new ArrayList<Y>();
        // А вот так можно
        //List<X> list1 = new ArrayList<>();
        List<Number> list1 = new ArrayList<>();
        //List<Number> list2 = new ArrayList<Integer>(); error
    }
    
}
