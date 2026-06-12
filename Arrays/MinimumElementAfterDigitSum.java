package Arrays;

import java.util.Arrays;

public class MinimumElementAfterDigitSum {

    public static void main(String[] args) {
        int[] arr = {999,19,199,100000};
        minElement(arr);
    }

    public static void minElement(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            while(nums[i]!=0){
                int rem = nums[i] % 10;
                sum = sum + rem;
                nums[i]=nums[i]/10;
            }
            temp[i] = sum;
        }
        int Smallest = Integer.MAX_VALUE;
        for(int i=0;i<temp.length;i++){
            if(temp[i] < Smallest){
                 Smallest = temp[i] ;
            }
        }
        System.out.println(Smallest);
        System.out.println(Arrays.toString(temp));

    }

}