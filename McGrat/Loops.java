package McGrat;

/**
 * Created by mr p on 02.03.2017.
 */
public class Loops {
    public static void main(String[] args) {
        String[] htm = { "HTML5", "in", "easy", "steps" } ;
        int j = 0 ;
        while ( j < htm.length )
        {
            System.out.println( "htm[" +j+ "] - | " + htm[j] ) ;
            j++ ;
        }
        String[] xml = { "XML", "in", "easy", "steps" } ;
        int k = 0 ;
        if ( xml.length > 0 ) do
        {
            System.out.println( "\t\txml["+k+"] - | "+xml[k] ) ;
            k++ ;
        } while ( k < xml.length ) ;
    }
}
