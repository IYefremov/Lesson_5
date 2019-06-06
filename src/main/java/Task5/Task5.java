// Create ArrayList of Strings. Add 5 different Strings to it.
//Using any cycle print all the values of the ArrayList to the console.
//    1) Create ArrayList of String and initialize it.
//2) The size of the ArrayList should be printed to the console.
//3) All values should be printed to the console (each from a new line)
package Task5;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();
        int stringNumber = 5;
        String str = "String #";

        // добавляем необходимое количество строк в лист.
        for (int i = 0; i < stringNumber; i++) {

            myArrayList.add(str.concat(Integer.toString(i)));
            System.out.println(myArrayList.get(i));
        }
        // выводим размер ArrayList
        System.out.println("We created ArrayList with " + myArrayList.size() + " elements");

    }
}
