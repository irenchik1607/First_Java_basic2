package section05_cycles;

//какой цикл выбрать?

public class WhichCycleType {
    public static void main(String[] args) {

        // for - всегда использовать, если идет концепция счетчика (от и до)
        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while - если в программе есть объект, который внутри себя соержит счетчик
        int j = 0;
        while (j < 4) {
            System.out.print(j++ + " ");
        }
        System.out.println();

        // do while - может вообще не использоваться в программах
        int k = 0;
        do {
            System.out.print(k++ + " ");
        } while (k < 4);
        System.out.println();
    }
}
