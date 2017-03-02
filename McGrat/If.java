package McGrat;

/**
 * Created by mr p on 02.03.2017.
 */
public class If {
    public static void main(String[] args) {
        if ( 5 > 7 ) System.out.println("Пять больше чем один");
        if ( 2 < 3 )
        {
            System.out.println( "Два меньше четырех." ) ;
            System.out.println( "Проверка выполнена успешно." ) ;
        }
        int num = 8 ;
        if ( ( ( num > 5 ) && ( num < 10 ) ) || ( num == 12 ) )
            System.out.println( "Число в диапазоне от 6 до 9 включительно или равно 12" ) ;
    }
}
