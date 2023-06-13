package section06_array;

import java.util.Arrays;

// определение длины массива
public class ArrayLenght {
    public static void main(String[] args) {
        int [] array = {8, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        System.out.println(array.length); // определение длины массива
        System.out.println(array[array.length - 1]); //последний элемент массива
    }
}
