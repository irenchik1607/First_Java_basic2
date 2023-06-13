package section03_expression;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        // считывание данных
        System.out.println("Enter 'a':");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter 'b':");
        var b = new Scanner(System.in).nextInt();

        // обработка
        var aPlusb = a + b;
        var aMinusb = a + b;
        var aMulb = a * b;
        var aDivb = a / b;
        var aModb = a % b;

        //вывод результатов
        System.out.println("a + b = " + aPlusb);
        System.out.println("a - b = " + aMinusb);
        System.out.println("a * b = " + aMulb);
        System.out.println("a / b = " + aDivb);
        System.out.println("a % b = " + aModb);

    }
}
