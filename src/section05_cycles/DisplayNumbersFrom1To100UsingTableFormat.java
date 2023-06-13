package section05_cycles;

// поэтапный подход в решении сложной задачи
public class DisplayNumbersFrom1To100UsingTableFormat {
    public static void main(String[] args) {
        // read source data
        var from = 1;
        var to = 100;
        var cols = 10;

        //display results
        for (int i = from; i <= to; i++) {
            System.out.print(i + "\t");

            if (i % cols == 0) {
                System.out.println();
            }
        }
    }
}
