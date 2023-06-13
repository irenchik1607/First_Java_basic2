package section06_array;

public class FindMinElement {
    public static void main(String[] args) {

        int [] array = {1, -2, 8, 0, -10};

        int minElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }

        } System.out.println(minElement);
    }
}

   /* // read source data
    int[] array = {1, -2, 8, 0, 5};

    // processing
    var min = array[0];
        for (int i = 1; i < array.length; i++) {
        if (array[i] < min) {
        min = array[i];
        }
        }

        // display results
        System.out.println(min);
        }
        }*/
