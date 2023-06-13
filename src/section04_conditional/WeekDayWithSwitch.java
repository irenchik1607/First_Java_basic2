package section04_conditional;

import java.util.Scanner;

public class WeekDayWithSwitch {
    public static void main(String[] args) {
        System.out.println("Enter the number of week day: ");
        var numberDay = new Scanner(System.in).nextInt();


        String result;
        switch (numberDay) {
            case 1: {
                result = "Понедельник";
                break;
            }
            case 2: {
                result = "Вторник";
                break;
            }
            case 3: {
                result = "Среда";
                break;
            }
            case 4: {
                result = "Четверг";
                break;
            }
            case 5: {
                result = "Пятница";
                break;
            }
            case 6: {
                result = "Суббота";
                break;
            }
            case 7: {
                result = "Воскресенье";
                break;
            }
            default: {
                result = "Ошибка, введите число от 1 до 7";
                break;
            }
        }
        System.out.println(result);
    }
}
