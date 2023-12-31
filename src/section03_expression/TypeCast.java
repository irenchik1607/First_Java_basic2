package section03_expression;

public class TypeCast {
    public static void main(String[] args) {

        //  int num = 1;
        //  char ch = '1';
        //  String s = "1";

        //преобразование любого типа данных в строку
        String is = String.valueOf(1); // преобразование int в строку
        String ds = String.valueOf(1.1);  // преобразование double в строку
        String bs = String.valueOf(true);  // преобразование boolean в строку
        String cs = String.valueOf('a');  // преобразование char в строку

        System.out.println("Hello " + 1 + 1.1 + true + 'a'); // если слева начинается со строки ("Hello "), то все
        // остальное тоже строкой считается


        //преобразование типа данных со строки
        int si = Integer.parseInt("12");
        double sd = Double.parseDouble("1.2");
        boolean sb = Boolean.parseBoolean("true");
        char ch1 = "a".charAt(0);
        char ch2 = "abcd".charAt(3);
        System.out.println(ch2);


        //типы данных "Примитивы"
        char ch = 2; //Выделено 2 байта для хранения данных в переменной
        int i = 4; //Выделено 4 байта для хранения данных в переменной
        double d = 8; //Выделено 8 байта для хранения данных в переменной

        d = i; //  в дабл можно записать значение типа интейджер: по байтам проходим
        d = ch; //  в дабл можно записать значение типа чар: по байтам проходим
        i = ch; //  в интейджер можно записать значение типа чар: по байтам проходим

        //i = d; невозможно в инт 4 байта вместить дабл 8 байтов: поэтому нужно привести к интейджер и обрезать то, что
               // не вмещается
        i = (int) d;
       //  ch = d;  невозможно в чар 2 байта вместить дабл 8 байтов: поэтому нужно привести к чар
        ch = (char) d;
        // ch = i;  невозможно в чар 2 байта вместить интейджер 4 байта: поэтому нужно привести чар
        ch = (char) i;

        boolean b = true; // невозможно привести ни к чему кроме строки
    }
}
