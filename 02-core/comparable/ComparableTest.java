package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    
    public static void main(String[] argv) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("alex");
        list.add("next");
        list.add("zears");
        list.add("finish");
        System.out.println("before sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("afer sort");
        System.out.println(list);
        
        
    }
}
