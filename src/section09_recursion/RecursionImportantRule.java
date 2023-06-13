package section09_recursion;


//важное правило - выход из рекурсии
public class RecursionImportantRule {
    public static void main(String[] args) {
        // рекурсия - это ситуация когда функция вызывает самц себя
        function1(100000);  // -ввход в рекурсиюю

    }

    private static void function1(int count) {
        if (count > 0) {        // это является выходом из рекурсии
            System.out.println(count);
            function1(count - 1);
        }

    }
}
