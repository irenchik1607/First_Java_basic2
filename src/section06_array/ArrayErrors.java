package section06_array;

// ошибка ArrayIndexOutOfBoundsException - индекс в массивах начинается с 0. если запросить индекс -1/или большое значение
// - то Джава не знает какой элемент отобразить, из-за этого возникает данная ошибка

public class ArrayErrors {
    public static void main(String[] args) {
        int [] array = {8, 2, 3, 4, 5};
        //System.out.println(array[-1]);
        System.out.println(array[50]);
    }
}
