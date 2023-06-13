package section06_array;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int startIndex = 1;
        int endIndex = 4;


        int[] destination = new int[endIndex - startIndex];
        for (int i = 0; i < destination.length; i++) { // System.arraycopy(source, startIndex, destination, 0, destination.length);
            destination[i] = source[i + startIndex];
        }
        System.out.println(Arrays.toString(destination));


    }
}
