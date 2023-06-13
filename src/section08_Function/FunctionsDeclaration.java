package section08_Function;

// формальные параметры функции

public class FunctionsDeclaration {


    private static void function1() {
        // функция объявлена - она не принимает никаких параметров. И при ее вызове ниже - тоже не указываются никакие параметры
    }

    private static void function2(int a){
        // функция принимает целое число. поэтому при ее объявлении нужно указать, что функция зависит от целого числа
        //при вызове функции указываем значение параметра, чтоб задача по расчету была выполнена
     if (a < 0) {

     }
    }

    private static void function3(int parametr1, int parametr2) {
        //зависит от двух параметров
    }

    private static void function4(boolean a, String b, double c) {

    }

    private static void function5(int [] array1, boolean [][][][] array3, double [] array2) {

    }

    public static void main(String[] args) {
        int a = 2;
        int b = 7;

        function1 ();
        function2 (3);
        function3 (a, b);
        function4 (true, "ghjb", 3.2);
    }
}
