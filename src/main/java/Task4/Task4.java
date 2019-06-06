
// Create an array of 15 random integers from the segment [0;   9]. Display the array on the screen.
// Count how many in the array of even elements and display this number on the screen on a separate line.
package Task4;

public class Task4 {
    public static void main(String[] args) {

        int startDiap = 0;
        int endDiap = 10;
        int[] array = new int[15];
        int[] resArray = new int[10];

        System.out.println();
        for (int i = 0; i < 15; i++) {
            array[i] = startDiap + (int) (Math.random() * endDiap);
            System.out.print(" " + array[i]);
            switch (array[i]) {
                case 0: {
                    resArray[0] += 1;
                    break;
                }
                case 1: {
                    resArray[1] += 1;
                    break;
                }
                case 2: {
                    resArray[2] += 1;
                    break;
                }
                case 3: {
                    resArray[3] += 1;
                    break;
                }
                case 4: {
                    resArray[4] += 1;
                    break;
                }
                case 5: {
                    resArray[5] += 1;
                    break;
                }
                case 6: {
                    resArray[6] += 1;
                    break;
                }
                case 7: {
                    resArray[7] += 1;
                    break;
                }
                case 8: {
                    resArray[8] += 1;
                    break;
                }
                case 9: {
                    resArray[9] += 1;
                    break;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + " occurs " + resArray[i] + " times");
        }
    }
}
