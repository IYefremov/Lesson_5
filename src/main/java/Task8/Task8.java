//        8. Create HashMap<String, String> and add 10 pairs:
//        watermelon, berry;
//        banana, fruit;
//        cherry, berry;
//        pineapple, fruit;
//        melon, vegetable;
//        cranberry, berry;
//        apple, fruit;
//        iris, flower;
//        potato, vegetable;
//        carrot, vegetable;
//        Print only vegetables to the console.
//        ) Do not use predefined keys to get vegetables. You should use conditions to find vegetables.
//        1) Map iterator;
//        2) Map.Entry
//        3) Foreach

package Task8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {

        HashMap<String, String> gardener = new HashMap();
        gardener.put("watermelon", "berry");
        gardener.put("banana", "fruit");
        gardener.put("cherry", "berry");
        gardener.put("pineapple", "fruit");
        gardener.put("melon", "vegetable");
        gardener.put("cranberry", "berry");
        gardener.put("apple", "fruit");
        gardener.put("iris", "flower");
        gardener.put("potato", "vegetable");
        gardener.put("carrot", "vegetable");

        // Print only vegetables to the console. Using foreach
        System.out.println("Print only vegetable. The \"Foreach cycle\"");
        for (String name : gardener.keySet()) {
            String value = gardener.get(name);
            if (value.equals("vegetable")) {
                System.out.println(name + " - " + value + ";");
            }
        }
        // Print only vegetables to the console. Using mapIterator
        System.out.println("Print only vegetable. Iterator using");

        Iterator<Map.Entry<String, String>> entries = gardener.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            if (entry.getValue().equals("vegetable")) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + ";");
            }
        }
        // Print only vegetables to the console. Using Map.Entry
        System.out.println("Print only vegetable. Using Map.Entry");
        for (Map.Entry<String, String> entry : gardener.entrySet()) {
            if (entry.getValue().equals("vegetable")) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }

    }
}
