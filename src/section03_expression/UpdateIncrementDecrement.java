package section03_expression;
// Операции обновления. Инкремент/Декремент
public class UpdateIncrementDecrement {
    public static void main(String[] args) {
        var a = 0;
        a = 5;
        System.out.println(a);

        a = a + 1;      // 2 выражения которые идентичны по результату
        System.out.println(a);
        a +=1;          // 2 выражения которые идентичны по результату
        System.out.println(a);

        a ++; //инкремент: сокращение варианта a +=1; работает только для а + 1
        System.out.println(a);

        a --; // декримент a = а - 1 => a -=1
        System.out.println(a);

        a*=2;
        a = a * 2;

        a /= 3;
        a = a / 3;

        System.out.println(a);
    }
}
