package section06_array;

// доступ к элементу массива

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(array));

        System.out.println(array[0]); // доступ к элементу массива - нумерация элементов начинается с 0

        array [0] = 45;
        System.out.print(array[0] + " ");
        System.out.print(array[1] + " ");
        System.out.print(array[2] + " ");
        System.out.print(array[3] + " ");
        System.out.print(array[4] + " ");
    }
}
