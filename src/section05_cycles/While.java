package section05_cycles;

public class While {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();


        // вариант 2 - можно вынести инициализацию и шагопределить внутрь цикла
        {
            int i = 0;
            for (; i < 5; ) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }


        //вариант 2 можно преобразовать в while
        {
            int i = 0;
            while (i < 5) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }
    }
}
