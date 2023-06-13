package section08_Function;

// передача переменных по значению и по ссылке

public class CommunicationBetweenFunctions {
    public static void main(String[] args) {
        int a = 9;
        function1(a);
        System.out.println(a);

    }

    private static void function1(int a) {
        a++;
    }
}

// переменные передаются по значению, если это примитивы или неизменяемые объекты
//другая категория объектов передается по ссылке - массивы и изменяемые объекты (стринг билдер)