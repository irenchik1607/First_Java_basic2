package section03_expression;

// операции сравнения
public class RelationalExpressions {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;
        System.out.println(a == b); //тип операции сравнения по равно и если они одинаковые - отобразить true
        System.out.println(a != b); //тип операции сравнения по не равно и если они одинаковые - отобразить true
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        var c1 = a == b; //одинаковые значения в это строке и в строке ниже
        boolean c2 = a == b;
        System.out.println(c1);
        System.out.println(c2);
    }
}
