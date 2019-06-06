
// Task2 2. Create ENUM and print.
package Task2;

public class Task2 {

    enum Week {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

    public static void main(String[] args) {

        Week currentDay;
        currentDay = Week.Saturday;
        System.out.println();
        switch (currentDay) {
            case Monday: {
                System.out.println("Today is " + currentDay);
                break;
            }
            case Tuesday: {
                System.out.println("Today is " + currentDay);
                break;
            }
            case Wednesday: {
                System.out.println("Today is " + currentDay);
                break;
            }
            case Thursday: {
                System.out.println("Today is " + currentDay);
                break;
            }
            case Friday: {
                System.out.println("Today is " + currentDay);
                break;
            }
            case Saturday: {
                System.out.println("Today is " + currentDay);
                break;
            }
            case Sunday: {
                System.out.println("Today is " + currentDay);
                break;
            }
        }
        for (Week days : Week.values()) {
            System.out.println(days);
        }
    }
}
