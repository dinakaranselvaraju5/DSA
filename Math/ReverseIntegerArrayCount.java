// 2442. Count Number of Distinct Integers After Reverse Operations



package Math;

import java.util.Arrays;

public class ReverseIntegerArrayCount {
    public static void main(String[] args) {
        
        int[] nums = {1,13,10,12,31};
         int[] res = new int[nums.length*2];
        res = Arrays.copyOf(nums, nums.length*2);
        System.out.println(Arrays.toString(res));
        int sum = 0;
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum = 0;
             while(nums[i]!=0){

            int rem = nums[i] % 10 ;
            sum = sum * 10 + rem;
            nums[i] = nums[i]/10;
        }
        temp[i] = sum;
    }
    // int start = 0;
    // int end = temp.length - 1;
    // while(start < end){
    //     int T = nums[start];
    //     nums[start] = nums[end];
    //     nums[end] = T;
    //     start++;
    //     end --;
    // }

    

   
   
  
    for(int i = nums.length;i<res.length;i++){
        res[i] = temp[res.length - i - 1];
    }
    System.out.println(Arrays.toString(res));
    int count = 1;
   // int i = 0;
    Arrays.sort(res);
    System.out.println(Arrays.toString(res));
   
    for(int i = 1;i<res.length;i++){
        if( res[i] > res[i - 1]){
            count = count + 1;
        }
    }

       System.out.println(count);
    }
    
}