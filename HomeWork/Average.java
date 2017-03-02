package HomeWork;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * Created by mr p on 02.03.2017.
 */
public class Average {
    public static void main(String[] args) {
        int[] numbers = {2,2,4,4};
        OptionalDouble average = Arrays.stream(numbers).average();
        System.out.println(average);
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
