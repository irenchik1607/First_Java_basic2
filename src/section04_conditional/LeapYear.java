package section04_conditional;

public class LeapYear {
    public static void main(String[] args) {
        var year = 2001;

        boolean isLeap;

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else  {
            isLeap = false;
        }

        //another variant 1

        if ((year % 400 == 0) || ((year % 100 != 0 && (year % 4 == 0)))) {
            isLeap = true;
        } else  {
            isLeap = false;
        }

        //another variant 2 - так как у нас булеан переменная, можно еще упростить
        isLeap = (year % 400 == 0) || ((year % 100 != 0 && (year % 4 == 0)));

        System.out.println(isLeap ? year + " is Leap" : year + " isn't Leap");
    }
}
