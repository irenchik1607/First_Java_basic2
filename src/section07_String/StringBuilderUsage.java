package section07_String;

public class StringBuilderUsage {
    public static void main(String[] args) {

        String s = "hello";

        StringBuilder builder = new StringBuilder();  // создание новой изменяемой строки, которую сами набираем поэтапно

        builder.append("world"); // яесли хотим в конец изменяемой строки дописать что-то

        builder.insert(0, "hello"); // дописать перед " world" слово "hello"

        builder.insert(5, ' ');

        String result = builder.toString();  // преобразовать в неизсменяемый формат
        System.out.println(result);

        builder.deleteCharAt(0); // удалить символ с изменяемой строки
        System.out.println(builder.toString());

        builder.setLength(0); // обнулили изменяемую строку
        // builder. delete(0, builder.length()); // удалить изменяемую строку

        System.out.println(builder.length());
        System.out.println("querty");
    }
}
