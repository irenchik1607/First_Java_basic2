package section04_conditional;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
       /* System.out.println("Enter the number of week day:");
        var wd = new Scanner(System.in).nextInt();

        if (wd == 1) {
            System.out.println("Monday");
        } else if (wd == 2) {
            System.out.println("Tuesday");
        }else if (wd == 3) {
            System.out.println("Wednesday");
        }else if (wd == 4) {
            System.out.println("Thursday");
        }else if (wd == 5) {
            System.out.println("Friday");
        }else if (wd == 6) {
            System.out.println("Saturday");
        }else if (wd == 7) {
            System.out.println("Sunday");
        }else  {
            System.out.println("Incorrect value");
        }*/

        var day = 78;

        String result;
        if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else if (day == 7) {
            result = "Sunday";
        } else {
            result = "Invalid day: " + day;
        }

        System.out.println(result);
    }
}
