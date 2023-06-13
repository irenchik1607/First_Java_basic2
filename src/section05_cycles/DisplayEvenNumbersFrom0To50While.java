package section05_cycles;

public class DisplayEvenNumbersFrom0To50While {
    public static void main(String[] args) {

        var from = 0;
        var to = 50;
        var step = 1;

        {
            var i = from;
            while (i <= to) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    i += step;
                } else {
                    i += step;
                }
            } System.out.println();
        }
    }
}
