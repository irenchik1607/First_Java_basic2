package section04_conditional;
//Рекомендации по использованию тернарного оператора

public class WeekDayWithTernaryOperatorBadExample {
    public static void main(String[] args) {
        var day = 7;
        System.out.println(
                day == 1 ? "Monday" :
                        day == 2 ? "Tuesday" :
                                day == 3 ? "Wednesday" :
                                        day == 4 ? "Thursday" :
                                                day == 5 ? "Friday" :
                                                        day == 6 ? "Saturday" :
                                                                day == 7 ? "Sunday" : "Invalid day: " + day);
    }
}
