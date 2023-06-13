package section07_String;

import java.sql.SQLOutput;

public class StringVsCharArray {
    public static void main(String[] args) {


        // сходство
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);
        }
        System.out.println();

        String s2 = "hello";
        for (int i = 0; i < s2.length(); i++) { // length() длина строки
            System.out.print(s2.charAt(i)); // charAt(i) - получить элемент по индексу: индекс начинается с нуля
        }
        System.out.println();

        // отличие
        // массив с символами можно изменить, строка - неизменная
        // с массивом можно сделать только 2 операции: получить длинну массива и получить элемент по индексу
        // в случае со сторок существует огромное количество методов


    }
}
