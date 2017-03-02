package HomeWork;

import java.util.Arrays;

/**
 * Created by mr p on 02.03.2017.
 */
public class First {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7};
        int i = 0;
        int[] arr1 = new int[arr.length];
        while (i<arr.length) {
            arr1[i] = arr[arr.length-1-i];
            i++;
        }
        System.out.println("The mirror array : " + Arrays.toString(arr1));
    }
}

