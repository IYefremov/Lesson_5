//        Create ArrayList of Strings. Add 10 different Strings to it.
//        Using any cycle find the longest String in the list and print it out.
//        If there are several String with the same legth - print each from a new line.
//        Create ArrayList of String and initialize it.
//        2) All values with the highest length should be printed out.
package Task6;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {

        ArrayList<String> strArrList = new ArrayList<String>();
        ArrayList<String> resultArrList = new ArrayList<String>();

        String[] strForArr = {"An ArrayList is a re-sizable array, also called a dynamic array",
                " It grows its size to accommodate new elements and shrinks the size when the elements are removed.",
                "ArrayList internally uses an array to store the elements",
                "Just like arrays, It allows you to retrieve the elements by their index",
                "In computer science, a dynamic array, growable array, resizable array, dynamic table, mutable array",
                "or array list is a random access, variable-size list data structure that allows elements to be adde",
                " It is supplied with standard libraries in many modern mainstream programming languages",
                "Resizable-array implementation of the List interface.",
                "Implements all optional list operations, and permits all elements, including null.",
                " In addition to implementing the List interface, this class provides methods to manipulate"};

        //Заносим строки  в ArrayList
        for (String aStrForArr : strForArr) {
            strArrList.add(aStrForArr);
        }

        // печатаем содержимое ArrayList + находим максимальную строку/строки
        int maxLength = 0;
        int tmpLenght;
        for (String aStrArrList : strArrList) {
            System.out.println(aStrArrList);
            tmpLenght = (aStrArrList.length());
            if (tmpLenght > maxLength) {
                resultArrList.clear();
                resultArrList.add(aStrArrList);
                maxLength = tmpLenght;
            } else if (tmpLenght == maxLength) {
                resultArrList.add(aStrArrList);
            }

        }
        // выводим максимальные строки
        System.out.println("\nWe have " + resultArrList.size() + " longest string(s)");
        for (String aResultArrList : resultArrList) {
            System.out.println(aResultArrList);
        }

    }
}
