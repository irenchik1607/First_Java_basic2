package section06_array;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {

        int[] array = {1, 2, 4,  6, 6, 4, 4, 9};


        boolean AllNumbers = true;
        String result;
        for (int value : array) {
            if (value < 0){
                AllNumbers = false;
                break;
            }
        }

        System.out.println(AllNumbers? "All positive" : "Not all positive");

    }
}
