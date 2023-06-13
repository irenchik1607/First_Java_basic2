package section07_String;

public class FindMinString {
    public static void main(String[] args) {

        String[] array = {"one", "two", "three", "four", "five"};

        String s = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(s) < 0) {
                s = array[i];
            }

        }
        System.out.println(s);
    }
}
