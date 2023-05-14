package class32;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCommonDemmo {
    public static void main(String[] args) {
        Map<String, Double> fruits=new TreeMap<>();
        fruits.put("Apple", 1.5);
        fruits.put("Apricot", 2.00);
        fruits.put("Gripes", 1.0);
        fruits.put("Strawberry", 2.0);
        fruits.put("Watermelon", 1.0);

        Map<String, Double> fruits2=new HashMap<>();
        fruits2.putAll(fruits);
        System.out.println(fruits2);
        System.out.println(fruits.replace("Apple", 20.0));
        System.out.println(fruits);
        System.out.println(fruits2.isEmpty());
        System.out.println(fruits2.containsKey("Apple"));
    }
}
