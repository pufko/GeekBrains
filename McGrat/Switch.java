package McGrat;

/**
 * Created by mr p on 02.03.2017.
 */
public class Switch {
    public static void main(String[] args) {
        int month = 2, year = 2017, num = 31 ;
        switch ( month ) {
            case 4 : case 6 : case 9 : case 11 : num = 30 ; break ;
            case 2 : num = ( year % 4 == 0 ) ? 29 : 28 ; break ;
        }
        System.out.println( month+"/"+year+": "+num+"дней" ) ;
    }
}
