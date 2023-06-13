package section07_String;

//сравнение строк по равно
public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "H" + s1.substring(1);

        System.out.println(s1);
        System.out.println(s2);

        if (s1.equals(s2)){ // сравнение строк происходит не через ==, а через конструкцию equals, чтоб сравнить контент, а не его реализацию ^^
            System.out.println("s1=s2");
        }
    }

}
