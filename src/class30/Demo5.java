package class30;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Fanta");
        drinks.add("cook");
        drinks.add("Pepsi");
        drinks.add("Monster");
        drinks.add("Juice");
        drinks.add("Sprite");

        for (String drink:drinks){
            if (drink.contains("a") || drink.contains("e")){
                drinks.set(drinks.indexOf(drink), "Water");
            }
        }
    }
}
