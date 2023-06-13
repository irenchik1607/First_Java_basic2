package section05_cycles;

public class MultiplicationTableCase2 {
    public static void main(String[] args) {
        var from =2;
        var to = 9;
        for (int i = from; i <= to; i++) {
            for (int j = from; j <= to; j++) {
                var rez = i * j;
                System.out.println( i + " * " + j + " = " + rez);
            }
            System.out.println();

        }
    }
}
