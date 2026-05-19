package Arrays;

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Maximum : " + FindMaximum(arr));
        System.out.println("Minimum : " + FindMinimum(arr));
        input.close();
    }


    static int FindMaximum(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        return max;
    }

    static int FindMinimum(int[] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(min > array[i]){
                min = array[i];
            }
        }

        return min;
    }
}