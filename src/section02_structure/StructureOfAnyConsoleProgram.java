package section02_structure;

import java.util.Scanner;

public class StructureOfAnyConsoleProgram {
    public static void main(String[] args) {

        // read source data - чтение исходных данных
        System.out.println("Please, enter the number:");
        var number = new Scanner(System.in).nextInt();

        // processing - обработка
        var result = number + 1;

        // display results - отображение результата
        System.out.println(result);

    }
}
