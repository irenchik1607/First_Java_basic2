package section04_conditional;

import java.util.Scanner;

public class UniversalWeekDay {
    public static void main(String[] args) {

       /* System.out.println("Enter the number of week day:");
        var wd = new Scanner(System.in).nextInt();
        System.out.println("Please answer (true or false): is Monday the first day of the week?");
        var isMondayFirst = new Scanner(System.in).nextBoolean();

        String result;
        if (isMondayFirst == true) {
            if (wd == 1) {
                result = "Monday";
            } else if (wd == 2) {
                result = "Tuesday";
            } else if (wd == 3) {
                result = "Wednesday";
            } else if (wd == 4) {
                result = "Thursday";
            } else if (wd == 5) {
                result = "Friday";
            } else if (wd == 6) {
                result = "Saturday";
            } else if (wd == 7) {
                result = "Sunday";
            } else {
                result = "Invalid day: " + wd;
            }
        } else if (wd == 1) {
            result = "Sunday";
        } else if (wd == 2) {
            result = "Monday";
        } else if (wd == 3) {
            result = "Tuesday";
        } else if (wd == 4) {
            result = "Wednesday";
        } else if (wd == 5) {
            result = "Thursday";
        } else if (wd == 6) {
            result = "Friday";
        } else if (wd == 7) {
            result = "Saturday";
        } else {
            result = "Invalid day: " + wd;
        }
        System.out.println(result);*/

        var day = 2;
        var isMondayFirst = false;

        var internalDay = day;
        if (!isMondayFirst) {
            internalDay--;
            if (internalDay == 0) {
                internalDay = 7;

            }

        }
        String result;
        if (internalDay == 1) {
            result = "Monday";
        } else if (internalDay == 2) {
            result = "Tuesday";
        } else if (internalDay == 3) {
            result = "Wednesday";
        } else if (internalDay == 4) {
            result = "Thursday";
        } else if (internalDay == 5) {
            result = "Friday";
        } else if (internalDay == 6) {
            result = "Saturday";
        } else if (internalDay == 7) {
            result = "Sunday";
        } else {
            result = "Invalid day: " + internalDay;
        }

        System.out.println(result);
    }
}
