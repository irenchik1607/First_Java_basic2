package section04_conditional;

// Тернарный оператор
public class TernaryOperator {
    public static void main(String[] args) {
        var a = 6;

        //Тернарный оператор - позволяет сократить синтаксиси по блоку ниже
        if (a == 5) {
            System.out.println(" a == 5");
        } else {
            System.out.println("a != 5");
        }
        //конец блока

        System.out.println(a == 5 ? "a == 5" : "a != 5"); // форма записи - позволяет сжать конструкцию if/else
    }
}
