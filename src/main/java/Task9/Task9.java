//        Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
//        Create HashSet<Integer> and add all unique numbers from the ArrayList.
package Task9;

import java.util.ArrayList;
import java.util.HashSet;

public class Task9 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();

        // создаем ArrayList с помощью генератора случайного числа
        for (int i = 0; i < 100; i++) {
            arrayList1.add((int) (Math.random() * 100));
        }
        // добавляем єлемент из ArrayList в hashSet и выводим содержимое ArrayList
        for (int i = 0; i < arrayList1.size(); i++) {
            hashSet.add(arrayList1.get(i));
            System.out.print(arrayList1.get(i) + " ");
            if (i != 0 && i % 10 == 0) System.out.println();
        }

        // выводим в консоль сожержимое hashSet
        System.out.println("\n");
        System.out.print("Our hashSet has such " + hashSet.size() + " unique elements");
        int newString = 0;
        for (Object aHashSet : hashSet) {
            if (newString++ % 10 == 0 && newString != 0) System.out.println();
            System.out.print(" " + aHashSet);
        }

    }
}
