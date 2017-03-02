package HomeWork;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * Created by mr p on 02.03.2017.
 */
public class Average2 {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 4, 4};
        double average = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
            System.out.println(average);
        }
    }
}
