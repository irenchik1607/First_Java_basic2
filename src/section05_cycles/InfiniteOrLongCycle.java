package section05_cycles;

//бесконечный цикл или длительная операция?

public class InfiniteOrLongCycle {
    public static void main(String[] args) {
        // необходимо расставить контрольные точки, по мере прохождения которых например будет выводиться сообщение
        // какое-то. Если обработка 2000000000 & more итераций длится долго, то можно:

        long time = System.nanoTime();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.currentTimeMillis();
        if (i %1000000 == 0) {
            System.out.println(i); //мы будем видеть, что прога не виснет, а выполняется
        }
       }
    }
}
