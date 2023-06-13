package section02_structure;

import java.util.Scanner;

public class HellowUser {
    public static void main(String[] args) {
        System.out.println("Write your name, please!");
        var name = new Scanner(System.in).nextLine();

        var result = "Hello, " + name;
        System.out.println(result);
    }
}
