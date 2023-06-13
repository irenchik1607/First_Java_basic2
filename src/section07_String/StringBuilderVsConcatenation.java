package section07_String;

//  Сравнение StringBuilder и конкатенации строк
public class StringBuilderVsConcatenation {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";

        String res1 = s1 + s2 + s3; // 1 способ

        String res2 = new StringBuilder().append(s1).append(s2).append(s3).toString(); // 2 способ - если нужно объединить
        // несколько строк в цикле - всегда нужно вот так...а если просто соединение строк - то вповоб 1 будет актуален




        System.out.println(res1);
        System.out.println(res2);

    }
}
