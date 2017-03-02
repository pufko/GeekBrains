package McGrat;

/**
 * Created by mr p on 02.03.2017.
 */
public class While {
    public static void main(String[] args) {
        int num = 100 ;
        while ( num > 0 )
        {
            System.out.println( "Обратный отсчет с использованием While: " + num ) ;
            num -= 10 ;
        }
    }
}
