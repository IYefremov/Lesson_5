// Task 3 Create Map vehicles : vehicles.put("BMW", 5);, print
package Task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map vehicles = new HashMap();
        vehicles.put("BMW", 5);
        vehicles.put("Audi", 4);
        vehicles.put("Mercedes", 2);

        System.out.println(vehicles.get("BMW"));
        System.out.println(vehicles.get("Audi"));
        System.out.println(vehicles.get("Mercedes"));
    }
}
