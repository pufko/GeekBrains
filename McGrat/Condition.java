package McGrat;

/**
 * Created by mr p on 02.03.2017.
 */
public class Condition {
    public static void main(String[] args) {
        int num1 = 1212 ;
        int num2 = 1455 ;
        String result ;
        result = ( num1 % 2 != 0 ) ? "Нечетное" : "Четное" ;
        System.out.println( num1 + " - " + result ) ;
        result = ( num2 % 2 != 0 ) ? " Нечетное " : " Четное " ;
        System.out.println( num2 + " - " + result ) ;
    }
}
