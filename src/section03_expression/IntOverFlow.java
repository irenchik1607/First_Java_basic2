
// особенности кодирования целых чисел и переполненность разрядов

package section03_expression;

import java.math.BigInteger;

public class IntOverFlow {
    public static void main(String[] args) {


        {
            var i = Integer.MAX_VALUE;
            System.out.println(i);
            System.out.println(i + 1); //разряд переполнен потому как к максимуму мы добавили еще +1 - и поэтому получаем отрицательное значение
        }
        {
            var i = Integer.MIN_VALUE;
            System.out.println(i);
            System.out.println(i - 1); //разряд переполнен потому как от минимума мы еще отняли -1 - и поэтому получаем положительное значение
        }

        // в этом случае необходимо выделить больше ячеек для хранения результатов

        //если мне не хватает типа Интейджер нужно перейти на тип Лонг (8 байтов).

        //Если и его не хватает - то нужно использовать спец класс БигИнтэйджер

        long g;
        BigInteger b = new BigInteger("");
    }
}
