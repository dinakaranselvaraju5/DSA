package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class ArrayInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input in Loop
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        input.close();
       // Printting the Array's
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }

        // For Each loop
        for (int Nums : arr) {
            System.out.print (Nums + " ");
            
        }
        System.out.println();
        System.out.println (Arrays.toString(arr));
    }
}