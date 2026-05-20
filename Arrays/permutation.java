package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class permutation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {0,2,1,5,3,4};
        
       int[] ans = new int[arr.length];
       for(int i=0;i<arr.length;i++){
         ans[i] = arr[arr[i]];
       } 
       input.close();
       System.out.println(Arrays.toString(ans));
              
              
             
            
        }
       // System.out.println(Arrays.toString(arr));

        //System.out.println(Arrays.toString(arr));
    }
