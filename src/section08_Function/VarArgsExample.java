package section08_Function;

//функции с переменным числом параметров
public class VarArgsExample {



    public static void main(String[] args) {
        System.out.println(concat());
        System.out.println(concat("Hello"));
        System.out.println(concat("Hello", "World"));
        System.out.println(concat("Hello", " ", "World"));
    }

    private static String concat (String... args){   // идентично private static String concat (String[] args)
        StringBuilder builder = new StringBuilder();
        for (String arg: args) {
            builder.append(arg);
        }
        return builder.toString();
    }

    // ограничение переменного числа параметров :
    //  1. только один тип данных

    //  2. если мы хотим перегрузить данную функцию, с функцией которая в качестве аргументов принимает массив
    //  String[] args это не получиться - потому как эти 2 реализации идентичны с точки зрения компилятора

    //  3. если мы хотим перегрузить данную функцию,с какой-то другой, которая может содержать переменное число
    //  аргументов + обязательные аргументы (например int), то переменное число аргументов должно быть последним
    //  параметром. Пример ниже

    private static String concat (int a, String... args){   // идентично private static String concat (String[] args)
        StringBuilder builder = new StringBuilder();
        for (String arg: args) {
            builder.append(arg);
        }
        return builder.toString();
    }

}
