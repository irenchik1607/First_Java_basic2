package section05_cycles;

//зачем нужны бесконечные циклы. оператор break

import java.util.Scanner;

public class InfiniteLoopExample {
    public static void main(String[] args) {
    // если нам заранее неизвестно количество итераций, которые нужно выполнить нашей пирограмме, то это означает,
        // что нам нужно использовать бесконечные циклы

        while (true) {
            var number = new Scanner(System.in).nextInt();
            if (number == 0) { // тут начинается
                break; //выход из бесконечного цикла - всегда использавать в бесконечных циклах
            }
            System.out.println(number * number);
        }
        System.out.println("buy");

    }
}
