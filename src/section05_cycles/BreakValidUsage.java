package section05_cycles;

// правильное использование break (для выхода изцикла - бесконечного или обычного)

import java.util.Random;
import java.util.Scanner;

public class BreakValidUsage {
    public static void main(String[] args) {

        // invalid
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
        System.out.println();

        // valid
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        //  валидное использование:
        // 1. Использование бесконечного цикла
        // 2. Если цикл конечный, то правильное использование break заключается в том, что условие выхода с цикла
        // никаким образом не зависит от условия выполнения цикла. Пример: угадать число используя 3 попыток при этом

        var number = new Random().nextInt(10);

        var guessed = false;
        for (int i = 0; i < 3; i++) {


            var guess = new Scanner(System.in).nextInt();
            if (guess < number) {
                System.out.println("number > " + guess+ ". Try again: ");
            } else if (guess > number) {
                System.out.println("number < " + guess + ". Try again: ");
            } else {
                guessed = true;
                System.out.println("Congratulations, you guessed the number!");
                break;
            }

        }

        if (guessed == false) {
            System.out.println("Limit reached");
        }
    }
}
