package section05_cycles;

public class NumberReverse {
    public static void main(String[] args) {

        // мой вариант
        {
            int x = 12356; // В нее будет заносится значение последней цифры в числе x

            int a;
            while (x > 0) {
                a = x % 10;              // Сначала в переменную a заносится последняя цифра числа x
                System.out.print(a); // Затем она выводится на экран
                x = x / 10; // А после - число x укорачивается на последний знак
            }
            System.out.println();
        }

        // вариант из курса
        {
            var number = 685465;

            var result = 0;
            var temp = number;
            while (temp > 0) {
                var digit = temp % 10;
                result = result*10 + digit;
                temp /=10;
            }
            System.out.println("Revers number: " + result);
        }
    }
}
