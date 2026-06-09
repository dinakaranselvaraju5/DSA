// Left Rotate an array by N places

package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// Optimal Approach for LeftRotate by N places
public class LeftRotateArray {

    public static void main(String[] args) {
        Integer[] arr = {2,3,4,5,6,7,88,99};
        //int[] arr = {2,3,4,5,6,7,88,99};
        int LRotate = 4;
        int N = arr.length;
        LeftRotate(arr,0,LRotate - 1);
        LeftRotate(arr, LRotate , N - 1);
        LeftRotate(arr, 0, N - 1);

        System.out.println(Arrays.toString(arr));
    }

    /* Using Manual Loop Method 
    public static void LeftRotate(int[] arr, int start,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    */
    // Using Inbuilt Functions    
    public static void LeftRotate(Integer[] arr, int start,int end) {
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list.subList(start, end + 1));   
    }
}







 /*  Brutte force Approach for N Rotate;
public class LeftRotateArray {

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,12,55,67,88};
        int LRotate = 6; // LRotate --> N place rotates
        int N = arr.length;
        LRotate = LRotate % N;
        int[] temp = new int[LRotate];
        temp = Arrays.copyOf(arr, LRotate);
        
        for (int i = LRotate; i < arr.length; i++) {
            arr[i - LRotate] = arr[i];
        }

        for (int i = arr.length - LRotate; i < arr.length; i++) {
            arr[i] = temp[i - ( arr.length - LRotate)];
            //i = 5 → temp[5 - (8 - 3)] = temp[0]
            //i = 6 → temp[6 - 5] = temp[1]
            //i = 7 → temp[7 - 5] = temp[2]
        }
        System.out.println(Arrays.toString(arr));
    }

}



// */














/*  -------------------Brutte Force Basic Approach------------------------

public class LeftRotateArray {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,66,77,89,100};
        int LRotate = 2;
        int N = arr.length;
        LRotate = LRotate % N;
        int[] temp = new int[LRotate];
        temp = Arrays.copyOf(arr,LRotate);
        for (int i = LRotate; i < arr.length; i++) {
            arr[i - LRotate] = arr[i];
        }
        int j = 0;
        for (int i = arr.length - LRotate; i < arr.length; i++) {
            arr[i] = temp[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

*/