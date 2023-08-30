package colmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMetodTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "us_1");
        map.put(1010, "us_2");
        map.put(72, "us_3");
        map.put(521, "us_4");
        map.put(null, "us_5");
        map.put(267, null);
        System.out.println(map);
        map.put(267, "us_6");// Предыдущий объект будет заменен этим
        System.out.println(map);

        // Добавление с проверкой уникальности ключа, в этом случае объект не будет добавлен
        map.putIfAbsent(267, null);
        System.out.println(map);
        System.out.println(map.get(72));
        map.remove(null);
        System.out.println(map);

        if (map.containsValue("us_3")) {
            System.out.println("Значение us_3 присутсвует");
        }
        if (map.containsKey(72)) {
            System.out.println("Ключ 72 присутсвует");
        }   
        System.out.println(" Множество всех ключей" + map.keySet());
        System.out.println(" Множество всех значений" + map.values());

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("Ключ " + entry.getKey() + " value " + entry.getValue());
        }


        Map<Integer, String> map1 = new HashMap<>(16, 0.75f);



    }
    
}
