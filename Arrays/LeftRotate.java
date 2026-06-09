
// Left Rotate the Array by one place

package Arrays;

import java.util.Arrays;

public class LeftRotate {

    public static void main(String[] args) {
        int[] arr = {111,3,4,5,6,7};
        int N = arr.length - 1;
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[N] = temp;
        System.out.println(Arrays.toString(arr));
    }
}