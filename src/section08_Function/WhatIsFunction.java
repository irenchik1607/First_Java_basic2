package section08_Function;
// функция - это именованный участок кода, который выполняет некоторую обработку исходных данных с целью получения результата
public class WhatIsFunction {
    public static void main(String[] args) {

        //read source data

        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var element = 2;

        //processing - этот блок кода может быть вынесен в виде отдельной функции

        var count = 0;
        for (int value : array){
            if (value == element) {
                count ++;
            }
        }

        // display result
        System.out.println(count);
    }
}
