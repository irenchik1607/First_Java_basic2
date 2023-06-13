package section05_cycles;

public class Factorial {
    public static void main(String[] args) {
        { // моя версия
            int n = 0;

            if (n < 0) {
                System.out.println("Value should be >=0");
            } else if (n == 0) {
                System.out.println(1);
            } else {
                var result = 1;
                for (int i = 1; i <= n; i++) {
                    result = result * i;
                    if (result < 0) {
                        System.out.println("Int overflow");
                        break;
                    }
                }
                if (result > 0) {
                    System.out.println(result);
                }


            }
        }


        { // версия преподавателя
            var value = 0;

            String finalResult;
            if (value < 0){
                finalResult = "Value should be >=0";
            } else {
                var result = 1;
                for (int i = 1; i <= value; i++) {
                    var oldResult = result;
                    result *= i;
                    if (oldResult != result/i) {
                        result = 0;
                        break;
                    }
                }
                finalResult = result==0? "Int overflow": String.valueOf(result);
            }
            System.out.println(finalResult);
        }
    }

}

