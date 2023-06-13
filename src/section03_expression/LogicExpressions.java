package section03_expression;

// логические выражения
public class LogicExpressions {
    public static void main(String[] args) {
        var a = true;
        var b = false;
        var c = 2 > 1;
        var d = 2 == 1;

        // к логическим выражениям применяются разные логические операнды

        System.out.println(!a); // операнд отрицания - НЕ "а"  -  выведет на экран значение противоположное значению а
        System.out.println(!b);

        System.out.println( a && b ); // логическое И - если хоть один из операндов false, значит результат false
        System.out.println( a || b ); // логическое ИЛИ - если хоть один изоперандов true, то будет результат true

    }
}
