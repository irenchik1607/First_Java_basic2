package section02_structure;

import java.util.Scanner;

public class In {
    public static void main(String[] args) {

        var a = new Scanner(System.in).nextInt();/* конструкция для того, чтобы записать в переменную то значение,
                                                которое введет пользователь */
        var b = new Scanner(System.in).nextInt();
        System.out.println(a+b);

        var d = new Scanner(System.in).nextDouble(); //если нужно чтоб ввели в консоль значение с плавающей точкой
        System.out.println(d);

        var s = new Scanner(System.in).nextLine();
        System.out.println(s);

        var ch = new Scanner(System.in).nextLine().charAt(0);
        System.out.println(ch);

        var bool = new Scanner(System.in).nextBoolean();
        System.out.println(bool);


    }
}
