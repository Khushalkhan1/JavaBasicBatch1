package class33;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        /*1. Create a map of a building. Store floor
        number and it is associated company
        name. (Example: 1= Google,
        2=joincoretech etc..). Insert 7 entries
        with duplicate keys and values.
        ● Check how many entries you have?
        ● Update company on a 4th floor
        ● Remove company on the 7th floor
        ● Print your map*/
        Map<Integer, String> building=new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Google");
        building.put(3, "KH-LLC");
        building.put(4, "Microsoft");
        building.put(5, "JoinCoreTech");
        building.put(5, "Apple");
        building.put(10, "Amazon");
        building.put(5, "JoinCoreTech");
        System.out.println(building);
        System.out.println(building.size());
        building.replace(4, "Microsoft1");
        System.out.println(building);
        building.replace(12, "Netflex");
        System.out.println(building);
        System.out.println(building);
        building.remove(12);

    }
}
