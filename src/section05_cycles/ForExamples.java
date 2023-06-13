package section05_cycles;

public class ForExamples {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { //возрастание
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        for (int i = 4; i >=0; i--) { // убывание
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) { // i растет, а ответ убывает
            System.out.print( 5 - i + " ");
        }
        System.out.println();

        for (int i = 50; i <= 100; i+=5) { // i в диапазоне от 50 до 100 включительно, шаг = 5
            System.out.print( i + " ");
        }
        System.out.println();

    }
}
