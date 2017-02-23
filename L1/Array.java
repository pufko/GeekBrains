package L1;

import java.util.Arrays;

/**
 * Created by mr p on 23.02.2017.
 */
public class Array {
    public static void main(String[] args) {
        int a = 10;
        int[] numbers = {10, 3, 5, 22};
            System.out.println(Arrays.toString(numbers));
 //         System.out.println(numbers[3]);
            numbers [3] = 12;
 //         System.out.println(numbers[3]);
            System.out.println(Arrays.toString(numbers));
        //itar
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        //iter + Tsb
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
