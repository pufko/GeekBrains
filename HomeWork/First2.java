package HomeWork;

import java.util.Arrays;

/**
 * Created by mr p on 02.03.2017.
 */
public class First2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7};

        System.out.println(Arrays.toString(reverse(a)));
    }

    private static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length >> 1; i++) {
            arr[arr.length - 1 - i] ^= arr[i] ^= arr[arr.length - 1 - i];
            arr[i] ^= arr[arr.length - 1 - i];
        }
        return arr;
    }
}