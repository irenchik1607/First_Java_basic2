package section05_cycles;

public class LoopWithProblem {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // зациклился процесс. прога как-будто бы зависла. Прервать цикл можно только
            // нажав на красный квадрат внизу и запустить программу в режиме отладки (установить точку останова) и
            // пошагово смотреть, что не так
            i--;
        }
        System.out.println("End");
    }
}
