package section06_array;

import java.lang.reflect.Array;
import java.util.Arrays;

// вывод массива на консоль
public class DisplayArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[5]; // [ 5 нулей ]

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

}
