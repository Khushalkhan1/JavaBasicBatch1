package class30;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {

        List<String> linkedList=new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("Watermelon");
        linkedList.add("Pineapple");
        linkedList.add("Strawberry");

        Iterator<String> iterator=linkedList.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            if (str.length()>6){
                iterator.remove();
            }
        }
        System.out.println(linkedList);

    }
}
