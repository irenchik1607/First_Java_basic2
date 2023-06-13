package section06_array;
// шаблоны кода для обхода массивов
public class ArrayIterator {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) { //array.fori - проходим по массиву в прямом порядке с начала и до конца
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) { //array.forr - проходим по массиву в обратном порядке с конца и до начала
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int element : array) { //array.for - проходим по массиву в прямом порядке с начала и до конца работа только с массивами - советуется
            System.out.print(element);
        }
        System.out.println();
    }
}
