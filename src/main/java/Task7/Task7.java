//        Task 7. Create HashMap<String, String> and add 10 pairs:
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
//
//        Print the content of the map, each pair from a new line.
//                Example:
//        watermelon - berry;
//        cherry - berry;
//...

package Task7;

import java.util.HashMap;

public class Task7 {
    public static void main(String[] args) {

        HashMap<String, String> garden = new HashMap();
        garden.put("watermelon", "berry");
        garden.put("banana", "fruit");
        garden.put("cherry", "berry");
        garden.put("pineapple", "fruit");
        garden.put("melon", "vegetable");
        garden.put("cranberry", "berry");
        garden.put("apple", "fruit");
        garden.put("iris", "flower");
        garden.put("potato", "vegetable");
        garden.put("carrot", "vegetable");

        for (String name : garden.keySet()) {
            String value = garden.get(name);
            System.out.println(name + " - " + value + ";");
        }
    }
}
