package class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {

        Set<String> hset=new HashSet<>();
        hset.add("apple");
        hset.add("orange");
        hset.add("mango");
        hset.add("watermelon");
        hset.add("grapes");
        hset.add("null");
        hset.add("apple");

        System.out.println(hset);
        hset.remove("apple");
        System.out.println(hset);

        for (String str:hset){
            System.out.println(str);
        }
        Iterator <String> it=hset.iterator();
        while (it.hasNext()){
            System.out.println(it.hasNext());
            String str= it.next();
            System.out.println(str);
        }
    }
}













