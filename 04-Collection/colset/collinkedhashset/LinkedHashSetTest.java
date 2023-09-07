package colset.collinkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(35);
        hashSet.add(3);
        hashSet.add(352);
        hashSet.add(4);
        System.out.println(hashSet);
        hashSet.remove(4);
        System.out.println(hashSet);

    }
    
}
