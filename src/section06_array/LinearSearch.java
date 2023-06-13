package section06_array;
// линейный поиск элемента в массиве - какой индекс элемента в нашем массиве
public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {0,1,6,3,4,5,6,7,8,9};
        var qvery = 6; //какой индекс этого элемента в нашем массиве?

        var index = -1; // обозначение того что элемент отсутствует в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] == qvery) {
                index= i;
                break;
            }
        }

        System.out.println(index);

    }
}
