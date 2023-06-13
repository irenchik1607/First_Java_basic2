package section07_String;

// плохая реализация реверса строк

public class ReverseStringBadExample {
    public static void main(String[] args) {
        //read source data
        String s = "Hello world";

        //processing - конкатинация строк неэффективна, на каждой итерации создается новая стринга и неэффективно используется память
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res = res + s.charAt(i);
        }

        // display result
        System.out.println(res);
    }
}
