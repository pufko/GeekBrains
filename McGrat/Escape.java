package McGrat;

/**
 * Created by mr p on 02.03.2017.
 */
public class Escape {
    public static void main(String[] args) {
        String header = "\n\tНью-Йорк прогноз на 3 дня: \n";
        header += "\n\tДень\t\tМакс\tМин\tОсадки\n" ;
        header += "\t....\t\t....\t...\t......\n" ;
        String forecast = "\tВоскресенье\t68F\t\t48F\tЯсно\n" ;
        forecast += "\tПонедельник\t69F\t\t57F\tЯсно\n" ;
        forecast += "\tВторник\t\t71F\t\t50F\tОблачность\n" ;
        System.out.print( header + forecast ) ;
    }
}
