package section08_Function;

//import static section08_Function.FunctionDeclarationAndUsage.sumOf;

public class SumLibrary {

    public static void main(String[] args) {

        short sh1 = 100;
        short sh2 = 200;

        int a = 100;
        int b = 500;

        long l1 = 20;
        long l2 = 40;

        float f1 = 12.222F;
        float f2 = 10.222F;

        double d1 = 12.5;
        double d2 = 12.1;

        System.out.println(sumOf(sh1, sh2));
        System.out.println(sumOf(b, (a)));
        System.out.println(sumOf(l1, (l2)));
        System.out.println(sumOf(f1, (f2)));
        System.out.println(sumOf(f1, (f2)));
        System.out.println(sumOf(d1, (d2)));

        /*
        *  System.out.println(sumOf((short)1, (short)2));
        System.out.println(sumOf(1, 2));
        System.out.println(sumOf(1L, 2L));
        System.out.println(sumOf(1.f, 2.f));
        System.out.println(sumOf(1., 2.));
        */
    }

    private static short sumOf(short sh1, short sh2) {
        return (short) (sh1 + sh2);
    }
    private static int sumOf(int a, int b) {
        return a + b;
    }
    private static long sumOf(long l1, long l2) {
        return  l1 + l2;
    }
    private static float sumOf(float f1, float f2) {
        return  f1 + f2;
    }
    private static double sumOf(double d1, double d2) {
        return  d1 + d2;
    }
}
