

// Linear Search Ascending


package Sorting;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a N Szie : ");
        int N = input.nextInt();
        int[] arr = new int[N];
        //int[] arr = {1,-9,188,98888,11,5};
        
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}