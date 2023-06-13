package section08_Function;



public class MyFirstFunction {
    public static void main(String[] args) { //щбысно функция main идет как public static
        // read source data
        int a = 2;
        int b = 3;

        // processing
        int res = multiply(a, b);

        // display results
        System.out.println(res);
    }

    private static int multiply(int a, int b) { // все остальные функции, которые объявляются, идут как private static
        return a * b;
    }

}