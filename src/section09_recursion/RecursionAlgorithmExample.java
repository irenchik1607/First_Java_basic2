package section09_recursion;

public class RecursionAlgorithmExample {
    public static void main(String[] args) {

        printNumbersFromA1To10();
        printNumbersFromAndTo10(1);
    }

    /*private static void printNumbersFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }*/

    private static void printNumbersFromA1To10() {
        int i = 1;
        while (true) {
            if (i > 10) {
                System.out.println();
                break;
            }
            System.out.print(i + "\t");
            i++;
        }
    }

    private static void printNumbersFromAndTo10(int value) { //рекурсивная функция
        if (value > 10) {
            System.out.println();        }
        else {
            System.out.println(value + "\t");
            printNumbersFromAndTo10(value+1);
        }
    }

}
