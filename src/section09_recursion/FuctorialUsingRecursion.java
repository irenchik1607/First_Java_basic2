package section09_recursion;

public class FuctorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int value) {
        if (value == 1 || value == 0) {
            return 1;
        } else {
            return factorial(value - 1);
        }
    }
}
