package section08_Function;

// при работе с функциями выделяют 2 ключевых понятия:
//    1. объявление функции
//    2. использование или вызов функции

// Важно!!!!!
// 1. чтоб функция находилась в теле класса
// недопустило объявление функции внутри другой функции
public class FunctionDeclarationAndUsage {

    public static void main(String[] args) {

        int res = sumOf(2,3); // тут происходит использование функции или ее вызов

        System.out.println(res);
        
        

    }

    // объявление функции
    private static int sumOf(int a, int b) {
        return a+b;
    }
}
