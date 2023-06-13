package section05_cycles;

public class DoWhileVersion {
    public static void main(String[] args) {
        {
            var from = 100;
            var to = 1;
            var step = 1;

            // do while
            {

                int i = from;
                do {
                    System.out.print(i + " ");
                    i -= step;
                } while (i >= to);
            }
            System.out.println();
        }

        {
            var from = 0;
            var to = 50;
            var step = 2;
            var i = from;
            do {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    i += step;
                } else {
                    i += step;
                }
            } while (i <= to);


        }
    }
}
