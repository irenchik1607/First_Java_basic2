package section09_recursion;


// что такое рекурсия. простая (функция вызывает саму себя явным образом) и сложная (функция вызывает саму себя неявным образом) рекурсия
public class RecursionIntro {
    public static void main(String[] args) {
        // рекурсия - это ситуация когда функция вызывает самц себя
        function1();  //-ввход в рекурсиюю

        main(args); //- функция вызывает самц себя
    }

    private static void function1() {

        function2();
    }

    private static void function2() {

        function3();
    }

    private static void function3() {

        function1();
    }

    // ошибка StackOverflowError - при работе текущей рекурсивной программы у нас произошло переполнение стэка
}
