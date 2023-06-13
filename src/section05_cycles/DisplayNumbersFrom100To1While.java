package section05_cycles;

public class DisplayNumbersFrom100To1While {
    public static void main(String[] args) {

        var from = 100;
        var to = 1;
        var step = 1;

        {
            int i = from;
            while (i >= to) {
                System.out.print(i + " ");
                i -= step;
            }
            System.out.println();
        }

    }
}
