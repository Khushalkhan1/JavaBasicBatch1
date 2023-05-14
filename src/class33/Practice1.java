package class33;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
   /* Create a map of countries with its
    capital that will store countries in
    alphabetical order.
    ● Print all keys and values from a
    country map u s in g for each loop and
    iterator.
    ● Print all values from a country map
    using for each loop and iterator.*/
        Map<String, String> countries=new TreeMap<>();
        countries.put("United State", "Washington DC");
        countries.put("Afghanistan", "Kabul");
        countries.put("Mexico", "Mexico City");
        countries.put("Canada", "Ottawa");
        countries.put("Ukraine", "Kiev");
        countries.put("Turkey", "Ankara");

        Set<String> countrieskeys=countries.keySet();
        for (String key:countrieskeys){
            System.out.println(key+ " "+ countries.get(key));
        }
        Iterator<String> it=countrieskeys.iterator();
        while (it.hasNext()){
            String key=it.next();
            System.out.println(key+ " "+countries.get(key));
        }
        Collection<String> values=countries.values();
        for (String value:values){
            System.out.println(value+ " "+ countries.get(value));
        }
        Iterator<String> iterator=values.iterator();
        while (iterator.hasNext()){
            String value=iterator.next();
            System.out.println(value+ " "+ countries.get(value));
        }


    }
}