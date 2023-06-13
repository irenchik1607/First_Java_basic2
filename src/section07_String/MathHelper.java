package section07_String;

import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {

        System.out.println("Enter cmd: {pi, e, exit or quit}\n" + "\n");

        String s1 = "pi";
        String s2 = "e";
        String s3 = "exit";
        String s4 = "quit";


        while (true) {

            String result = new Scanner(System.in).nextLine();
            if (result.equals(s1)){
                System.out.println(Math.PI);;
            } else if (result.equals(s2)){
                System.out.println(Math.E);
            }else if (result.equals(s3) || result.equals(s4)){
                break;
            } else {
                System.out.println("Invalid cmd. Try again!");
            }

        }

    }
}
