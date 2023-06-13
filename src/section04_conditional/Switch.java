package section04_conditional;

public class Switch {
    public static void main(String[] args) {

      /*  var a = 10;

        switch (a){
            case 1 : {
                System.out.println("1");
                break;
            }
            case 2 : {
                System.out.println("2");
                break;
            }
            case 3 : {
                System.out.println("3");
                break;
            }
            default : {
                System.out.println("default");
                break;
            }
        }*/

        // jan, feb, mar, apr,may, jun, jul, aug, sep, oct, nov, dec
        // 1  , 2  , 3  , 4  , 5 ,  6,   7,   8,   9,   10,  11,  12

        var month = 22;

        switch (month) {
            case 1:
            case 2:
            case 12:{
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5:{
                System.out.println("Sprint");
                break;
            }
            case 6:
            case 7:
            case 8:{
                System.out.println("Summer");
                break;
            }
            case 9:
            case 10:
            case 11:{
                System.out.println("Autumn");
                break;
            }
            default:{
                System.out.println("Incorrect number month: "+ month);
                break;
            }

        }
    }
}
