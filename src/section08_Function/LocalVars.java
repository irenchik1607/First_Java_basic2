package section08_Function;

// область видимости локальных переменных - локализирована внутри функции
public class LocalVars {
    public static void main(String[] args) {
        int a = 3;
        function1();
      //  function2();
    }

    private static void function1() {
        int a = 3;
    }

    private static void function2(int a) {
      //  int a = 3; // ошибка,потому что формальный параметр уже объявлен ^^ и локальный с таким же именем создать некак
    }
}
