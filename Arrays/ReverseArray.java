package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a N : ");
        int N = input.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = input.nextInt();
        }

        ReverseArray(arr);
        input.close();
    }

    private static void ReverseArray(int[] arr) {
        int Start = 0;
        int End = arr.length - 1;
        while(Start<End){
            int temp = arr[Start];
            arr[Start] = arr[End];
            arr[End] = temp;
            Start++;
            End--; 
        }

        System.out.println(Arrays.toString(arr));

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr));
        // }
    }
}