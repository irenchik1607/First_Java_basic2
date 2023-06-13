package section07_String;

import java.math.BigInteger;

public class BigIntegerSum {
    public static void main(String[] args) {

        // read source data
        var a = "123456789012345678901234567890123456789012345678901234567890";
        var b = "12345678901234567890123456789012345678901234567890";

        // processing

        var a1 = a.length() >= b.length() ? a : "0".repeat(b.length() - a.length()) + a;
        var b1 = b.length() >= a.length() ? b : "0".repeat(a.length() - b.length()) + b;

        System.out.println(a1);
        System.out.println(b1);

        StringBuilder res = new StringBuilder();
        int preDigit = 0;
        for (int i = a1.length() - 1; i >= 0; i--) {
            var digit1 = Integer.parseInt(String.valueOf(a1.charAt(i)));
            var digit2 = Integer.parseInt(String.valueOf(b1.charAt(i)));

            int sum = digit1 + digit2 + preDigit;

            if (sum > 9) {   // если наша сумма 2-х цифр больше 9, то нужно перенести 1 в след разряд
                preDigit = 1;
                sum = sum % 10;
            } else {
                preDigit = 0;
            }

            res.insert(0, sum);

        }
        if (preDigit != 0) {
            res.insert(0, preDigit);
        }

        //display results
        System.out.println(res.toString());

        System.out.println(new BigInteger(a).add(new BigInteger(b)));
    }
}
