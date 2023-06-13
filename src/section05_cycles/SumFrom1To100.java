package section05_cycles;

public class SumFrom1To100 {
    public static void main(String[] args) {

        var from = 1;
        var to = 100;
        var step = 1;

        int sum = 0;
        int sum1;

        for (int i = from; i <= to; i += step) {
            sum = sum + i;

        }

        System.out.println(sum);


    }
}
