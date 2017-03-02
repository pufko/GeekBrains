package HomeWork;
import java.util.Arrays;
/**
 * Created by mr p on 02.03.2017.
 */
public class First3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7};
        System.out.println(Arrays.toString(reverse(a)));
    }
    private static int[] reverse(int[] in) {
        int tmp;
        for (int i = 0; i < in.length/2; i++) {
            tmp = in[in.length - 1 - i];
            in[in.length - 1 - i] = in[i];
            in[i] = tmp;
        }
        return in;
    }
}
