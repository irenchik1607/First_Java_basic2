package section05_cycles;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber2 {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        System.out.println("Enter number from 0 till 9");

        String result;
        while (true) {

            var guess = new Scanner(System.in).nextInt();
            if (guess < number) {
                result ="number > " + guess+ ". Try again: ";
                System.out.println(result);
            } else if (guess > number) {
                result ="number < " + guess + ". Try again: ";
                System.out.println(result);
            } else {
                result = "Congratulations, you guessed the number!";
                System.out.println(result);
                break;
            }

        }

    }
}
