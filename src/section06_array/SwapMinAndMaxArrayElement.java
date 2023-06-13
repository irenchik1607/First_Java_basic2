package section06_array;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {

        int[] array = {1, -2, 3, 8, 5};

        var indexOfMinEl = 0;
        var minValue = array[0];
        var indexOfMaxEl = 0;
        var maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            var current = array[i];
            if (current < minValue) {
                minValue = current;
                indexOfMinEl = i;
            }
            if (current > maxValue) {
                maxValue = current;
                indexOfMaxEl = i;
            }
        }

        var temp = array[indexOfMaxEl];
        array[indexOfMaxEl] = array[indexOfMinEl];
        array[indexOfMinEl] = temp;
        System.out.println(Arrays.toString(array));

    }
}
