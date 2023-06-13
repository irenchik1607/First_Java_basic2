// Погрешности работы с числами с плавающей точкой

package section03_expression;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleAccuracyIssues {
    public static void main(String[] args) {

        var a = 2;
        var b = 1.1;
        var c = a - b;
        System.out.println(c); // результат 0.8999999999999999 возникает из-за погрешности кодирования Дабл типов

        BigDecimal e = new BigDecimal("2");
        BigDecimal f = new BigDecimal("1.1");
        BigDecimal k = e.subtract(f);// c = a.subtract(b) =>  c = a - b
        System.out.println(k);

        System.out.println(22. / 7.);
        System.out.println(new BigDecimal("22").setScale(20).divide(new BigDecimal("7"), RoundingMode.HALF_UP));

    }


}
