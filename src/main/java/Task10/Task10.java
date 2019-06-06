//        10. Create enum for days of the week.
//        Write a program which will be printing the number of a day according to day of the week.
//        Example:
//        If today is Sunday - print 1;
//        If today is Monday - print 2
//         Use switch(day of the week) to pass the day of the week.

package Task10;

public class Task10 {

    enum Week2 {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

    public static void main(String[] args) {

        System.out.println();
        for (Week2 days : Week2.values()) {
            int currDay = days.ordinal();
            switch (currDay) {
                case 0: {
                    System.out.println(++currDay + " day is " + "Monday — run day. ");
                    break;
                }
                case 1: {
                    System.out.println(++currDay + " day is " + "Tuesday — news day.");
                    break;
                }
                case 2: {
                    System.out.println(++currDay + " day is " + "Wednesday — friends day.");
                    break;
                }
                case 3: {
                    System.out.println(++currDay + " day is " + "Thursday — bears day.");
                    break;
                }
                case 4: {
                    System.out.println(++currDay + " day is " + "Friday — my day.");
                    break;
                }
                case 5: {
                    System.out.println(++currDay + " day is " + "Saturday — flatter day.");
                    break;
                }
                case 6: {
                    System.out.println(++currDay + " day is " + "Sunday — fun day!");
                    break;
                }
            }
        }
    }
}
