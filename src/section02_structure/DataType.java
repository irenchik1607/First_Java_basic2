package section02_structure;

public class DataType {
    public static void main(String[] args) {
        int i = 0; // int - целое число в диапазоне -2147483648<0<2147483647
        System.out.println(Integer.MIN_VALUE + "<" + i + "<" + Integer.MAX_VALUE);

        double d = 0.5; // double - число с плавающей точкой в диапазоне 4.9E-324<0.5<1.7976931348623157E308
        System.out.println(Double.MIN_VALUE + "<" + d + "<" + Double.MAX_VALUE);

        boolean b1 = true; // логический тип данных: принимает значение true/false
        boolean b2 = false;

        char ch = 'a'; /* символьний тип данных: диапазон <a(97)< - кодируются символы. Чтобы их кодировать
                          существует специальная таблица Unicode Character Table https://unicode-table.com/ru/#0041
                          Закодирован каждый символ каждого языка на планете */
        System.out.println(Character.MIN_VALUE + "<" + ch + "(" + (int) ch + ")<" + Character.MAX_VALUE); /* ch
                          приведен к (int) - чтоб увидеть его десятичный код. Так мы видим, что символ 'a' находится
                          под номером 97*/

        String s = "Hellow Ira"; // строковый тип: хранит целую строку
        System.out.println(s);

        /* var - ключевое слово, не является каким-либо типом - это рекомендация компилятору определить
        тип автоматически
         */
    }
}
