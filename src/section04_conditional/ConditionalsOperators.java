package section04_conditional;
// рекомендации по использованию условных операторов
public class ConditionalsOperators {
    public static void main(String[] args) {
        var day = 1;

        // if else - всегда использовать эту конструкцию
        if (day == 6 || day == 7){
            System.out.println("Weekend");
        }else {
            System.out.println("Workday");
        }

        // Ternary - только если условие максимально простое и может быть записано в одну строку
        System.out.println(day == 6 || day == 7 ? "Weekend":"Workday");

        // Switch - нужно стараться избегать данный оператор
        switch (day){
            case 6:
                case7:{
                    System.out.println("Weekend");
                    break;
                }
                default:{
                    System.out.println("Workday");
                    break;
                }
        }

    }
}
