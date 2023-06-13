package section08_Function;

// блок изолирует локальные переменные
public class BlockExample {

    public static void main(String[] args) {
        int a = 8;

        {
            int b = 5;
            System.out.println(b);
            System.out.println(a);
            {
                int c = 7;
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);

            }
        }
        System.out.println(a);
    }

}
