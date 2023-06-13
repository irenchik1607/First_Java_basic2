package section05_cycles;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {

        /* мой вариант
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print((i*j) + "\t");
            }
            System.out.println();
        }*/

        var to = 9;
        for (int i = 1; i <= to; i++) {
            for (int j = 1; j <= to; j++) {
                var rez = i * j;
                System.out.print(rez == 1 ? "\t" : rez + "\t");
            }
            System.out.println();

        }
    }
}
