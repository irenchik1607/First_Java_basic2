package section08_Function;

import static javax.management.Query.div;

//перегрузка функций: функции могут иметь одинаковые наименования, но должны иметь разное количество, тип или порядок
// аргументов

public class FunctionOverloading {

    public static void main(String[] args) {
        System.out.println(div(1, 2));
        System.out.println(div(1., 2.));
    }

    private static int div(int a, int b) {
        return a / b;
    }

    private static double div(double a, double b) {
        return a / b;
    }
}
