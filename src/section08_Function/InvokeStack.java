package section08_Function;

public class InvokeStack {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        functional1 (a, b);
        functional2 (a, b);
    }
    private static void functional1(int a, int c){
        int b = 0;
        functional2 (a, b);

    }
    private static void functional2(int a, int b) {
        System.out.println(a/b);
    }
}
