//1. Create ArrayList and print it.

package Task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }

        System.out.println("The size of arrayList is " + arrayList.size());

        for (int i : arrayList) {
            System.out.print(arrayList.get(i) + " ");
            if (i % 10 == 0 && i != 0) System.out.println();
        }

    }
}
