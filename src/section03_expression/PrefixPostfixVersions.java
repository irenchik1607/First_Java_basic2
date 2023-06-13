package section03_expression;

// префиксная и посфиксная версия инкремента и декремента
public class PrefixPostfixVersions {
    public static void main(String[] args) {
        var a = 0;
        ++a; // префиксная в этом примере идентичо постфиксной
        a++; // посфиксная
        System.out.println(a);

        var b = a++; // сначала записали старое значение "а" до инкремента, а потом увеличили его на 1
       /*
       var b = a;
       a = a+1;
       */

        var c = ++a; // сначала увеличили "а" на 1 а потом присвоили это значение переменной "с"
        /*
        a = a + 1;
        var c = a;
        * */

        System.out.println(b);
        System.out.println(c);
        System.out.println(a);

        // с декриментом та же ситуация
    }
}
