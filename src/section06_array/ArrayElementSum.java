package section06_array;

public class ArrayElementSum {
    public static void main(String[] args) {

        int [] source = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int value : source) {
            sum = sum + value;
        }
        System.out.println(sum);

    }
}
