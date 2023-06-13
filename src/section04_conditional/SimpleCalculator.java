package section04_conditional;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Please, enter 'a':");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Please, enter 'b':");
        var b = new Scanner(System.in).nextInt();
        System.out.println("Please, enter operator: {+,-,*,/,%}");
        var operation = new Scanner(System.in).nextLine().charAt(0);

        String result;
        if (operation == '+') {
            result = "a + b = " + (a + b);
        } else if (operation == '-') {
            result = "a - b = " + (a - b);
        } else if (operation == '*') {
                result = "a * b = " + (a * b);
        } else if (operation == '/') {
            result = "a / b = " + (a / b);
        } else if (operation == '%') {
            result = "a % b = " + (a % b);
        } else {
            result = "Unsupported operation: " + operation;
        }

        System.out.println(result);
    }
}
