package section03_expression;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        System.out.println("Please, enter a:");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Please, enter b:");
        var b = new Scanner(System.in).nextInt();

        var c = a;
        var d = b;

        a = d;
        System.out.println("a = " + a);
        b = c;
        System.out.println("b = " + b);


    }
}
