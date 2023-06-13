package section07_String;

// методы генерации новых строк на базе существующих

import java.util.Arrays;

public class StringNewStringMethods {
    public static void main(String[] args) {
        String s = " Hello world ";

        // строки не подлежат изменениям. единственный способ - это создать новую строку на базе существующей

        System.out.println("s.toUpperCase() = " + s.toUpperCase()); // все элементы сущ-ей строки привести к верхнему регистру
        System.out.println("s.toLowerCase() = " + s.toLowerCase()); // антоним ^^ преобр-ние к нижнему регистру

        System.out.println("s.repeat(2) = " + s.repeat(2)); // повторение строки н-ное кол-во раз

        s = s.repeat(2); // присвоили переменной S значение. теперь все команды ниже будут обращаться к s = s.repeat(2)

        System.out.println("s.replace('l', 'j') = " + s.replace('l', 'j'));// позволяет заменять символы либо целые строки в исходной строке
        System.out.println("s.replace(\"Hello\", \"Bye\") = " + s.replace("Hello", "Bye"));

        System.out.println("s.substring(6) = " + s.substring(6)); // получить новую подстроку начиная с 6 символа
        System.out.println("s.substring(0, 6) = " + s.substring(0, 6));    // обозначили с какого по какой вырезаем (end индекс не участвует в вырезании) для новой строки

        System.out.println("s.split(\" \") = " + Arrays.toString(s.split(" ")));// позволяет разделить строку по какому-то условию (например по пробелу)

        System.out.println(s.trim());// убирается начальный и конечный пробелы в текущей строке
        System.out.println(s.strip()); // убирается начальный и конечный пробелы в текущей строке - более поздняя версия - универсальная и работает для любой кодировки
    }
}
