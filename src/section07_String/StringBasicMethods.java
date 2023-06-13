package section07_String;

import java.util.Arrays;

// основные методы для работы со строками
public class StringBasicMethods {
    public static void main(String[] args) {

        String s = "hello";

        // условно все методы делятся на 3 группы: базовые методы, методы проверок и методы генерации новых строк

        System.out.println("s.length = " + s.length()); // метод возвращает длину строки
        System.out.println("charAt(0) = " + s.charAt(0)); // метод возвращает символ по индексу
        System.out.println("toCharArray() = " + Arrays.toString(s.toCharArray()));// метод позволяет строку преобразовать в массив символов
    }
}
