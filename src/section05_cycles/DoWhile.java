package section05_cycles;

//do while цикл
public class DoWhile {
    public static void main(String[] args) {

        // while
        //вариант 2 можно преобразовать в while
        {
            int i = 100;
            while (i >=1 ) {
                System.out.print(i-- + " ");
            }
            System.out.println();
        }

        //do while - отличие = тело цикла выполняется как минимум один раз. Тело цикла while / for
        // может ни разу не выполниться
        {
            int i = 100;
            do {
                System.out.print(i-- + " ");
            } while (i >=1 );
            System.out.println();
        }
    }
}
