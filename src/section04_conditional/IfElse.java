package section04_conditional;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        if (a > b) {
            var result = "a > b";
            System.out.println(result);
        }

        //

        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }

        // вложенные циклы
        if (a > b) {
            System.out.println("a > b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
        }
        System.out.println("after");

        // можно упростить ^^
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {                  // место сокращения
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // можно работать с переменными boolean
        boolean condition = a > b;
        if (condition) {
            System.out.println("condition = true");
        } else {
            System.out.println("condition = false");
        }

        //  в условии If  можно указывать сложные выражения? результатом которого является логический тип данных
        if (condition || a < b && a > 1 || !(b < 7)) {
            System.out.println("Example");
        }
    }
}