package section07_String;

//методы для проверки строк: возвращают либо логические типы данных либо какие-то индексы
public class StringVerificationMethod {
    public static void main(String[] args) {
        String s = "hello World World!";

        System.out.println("s.contains(\"World\") = " + s.contains("World")); //содержит ли наша строка данную подстроку
        System.out.println("s.contains(\"world\") = " + s.contains("world"));

        System.out.println("s.indexOf(\"o\") = " + s.indexOf("o")); // какой индекс в текущей строке у символа "o"
        System.out.println("s.lastIndexOf(\"o\") = " + s.lastIndexOf("o"));   // какой индекс в текущей строке у последнего символа "o"

        System.out.println("s.indexOf(\"World\") = " + s.indexOf("World")); // первое вхождение слова начинается с 6-го индекса
        System.out.println("s.lastIndexOf(\"World\") = " + s.lastIndexOf("World"));// следующего вхождения слова начинается с 12 символа

        System.out.println("s.startsWith(\"hello\") = " + s.startsWith("hello")); //проверка начинается ли строка с подстроки?
        System.out.println("s.endsWith(\"World!\") = " + s.endsWith("World!"));  //проверка заканчивается ли строка на подстроку?

        System.out.println("s.isEmpty() = " + s.isEmpty()); // является ли наша строка пустой?
    }
}
