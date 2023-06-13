package section06_array;

import java.util.Arrays;

// многомерные массивы
public class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] array1 = new int[3][4]; // двумерный массив 3 строки и 4 столбца
        int[][] array2 = {              // двумерный массив 3 строки и 4 столбца с инициализацией
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        System.out.println(array2[0][1]); // вывод значения пересечения нудевой строки и 1 столбца


        for (int[] row : array2) {  // вывод многомерного массива на консоль
            System.out.println(Arrays.toString(row));
        }
    }
}
