package section07_String;

public class ReverseStringBuilder {
    public static void main(String[] args) {

        //read source data
        String s = "Hello world";

        //processing
        StringBuilder builder = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {
        builder.append(s.charAt(i));
        }

        /* альтернатива 1  - подставлять в префиксном методе. цикл тогда идет в прямом порядке i++
        * for (int i = 0; i < s.length(); i++) {
        builder.insert(0, s.charAt(i));
        }
        */


        /* альтернатива 2 - в изменяемую строку записать неизменяемую строку и с помощью метрода reverse развернуть ее
        * builder.append(s).reverse();
        * */

        // display result

        System.out.println(builder.toString());


    }
}
