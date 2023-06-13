package section08_Function;

public class SumFunctionWithVarArgs {

    public static void main(String[] args) {
        System.out.println(sumOf(5, 5, 3));
        System.out.println(sumOf(15, 15, 34));
    }


    private static int sumOf(int... args) {

       /* int result = 0;
        for (int i = 0; i < args.length; i++)
            result = result + args[i];
        return result;*/

        int result = 0;
        for (int arg : args) {
            result += arg;
        }
        return result;
    }

}
