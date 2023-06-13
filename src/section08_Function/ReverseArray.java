package section08_Function;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        revers(array);

        System.out.println(Arrays.toString(array));
    }

    private static void revers(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            var temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = temp;
        }
    }

}
