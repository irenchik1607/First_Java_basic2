package section07_String;

public class PrintReverseString {
    public static void main(String[] args) {
        String s = "Hello world!";
        //или
        //System.out.print(s.replace("Hello world!" , "!dlrow olleH"));

        /*или
        System.out.print(s.substring(11));
        System.out.print(s.substring(9,10));
        System.out.print(s.substring(8,9));
        System.out.print(s.substring(7,8));
        System.out.print(s.substring(6,7));
        System.out.print(s.substring(5,6));
        System.out.print(s.substring(4,5));
        System.out.print(s.substring(3,4));
        System.out.print(s.substring(2,3));
        System.out.print(s.substring(1,2));
        System.out.print(s.substring(0,1));*/

        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }

    }
}
