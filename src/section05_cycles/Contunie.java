package section05_cycles;

// рекомендации по использованию оператора Contunie - не использовать его))) встречается крайне редко
public class Contunie {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i >= 3 & i <= 6) {
                continue; // оператор пропускает текущую итерацию цикла и с 3 до 6 числа выводиться не будут
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
