package section03_expression;

// приоритет и ассоциативность операторов можно посмотреть тут- https://introcs.cs.princeton.edu/java/11precedence/
public class OperatorPrecedence {
    public static void main(String[] args) {
        var a = 4;
        var b = 2 + -4 * 5 - a++ / 4 + --a;

        a = 4;
        var c = 2 + ((-4) * 5) - ((a++) / 4) + (--a);

        System.out.println(b);
        System.out.println(c);

        System.out.println((1 + 1) + "Hello ");
        System.out.println("Hello " + (1 + 1));
    }
}
