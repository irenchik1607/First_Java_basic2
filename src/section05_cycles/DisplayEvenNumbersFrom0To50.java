package section05_cycles;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {

        int from = 0;
        int to = 50;
        int step = 1;

        for (int i = from; i <= to; i += step){
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

    }
}
