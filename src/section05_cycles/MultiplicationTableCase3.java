package section05_cycles;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {

/* мой правильный вариант
        var to = 9;

        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= 5; j++) {
                var rez = i * j;
                System.out.print( j + " * " + i + " = " + rez + "\t"+ "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 2; i <= to; i++) {
            for (int j = 6; j <= 9; j++) {
                var rez = i * j;
                System.out.print( j + " * " + i + " = " + rez + "\t"+ "\t");
            }
            System.out.println();
        } */

        // оптимизация ^^ варианта приводится ниже

        var to = 9;
        var cols = 4;
        for (int r = 2; r < to; r += cols) { // += cols  - 4 столбца

            for (int i = 2; i <= to; i++) {
                for (int j = r; j < r + cols & j <= to; j++) {
                    var rez = i * j;
                    System.out.print( j + " * " + i + " = " + rez + "\t"+ "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
