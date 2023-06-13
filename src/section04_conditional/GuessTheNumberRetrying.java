package section04_conditional;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberRetrying {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        System.out.println("Enter number from 0 till 9");
        var guess = new Scanner(System.in).nextInt();


        String result = number == guess ? "Congratulations, you guessed the number!" : "Sorry, but your number is " +
                "invalid! Try again later...";

        System.out.println(result);

    }
}
