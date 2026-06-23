

/*


    LeetCode Question Number : 2535
    Difference Between Element Sum and Digit Sum of an Array


    You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.



*/

package Leetcode_Series;

public class DifferenceSum {

    public static void main(String[] args) {
        int[] arr = {1,15,6,3};
        int ans = differenceOfSum(arr);
        System.out.println(ans);
    }

    public static int differenceOfSum(int[] nums) {
        int DigitSum0fnums = 0;
        int ElementSumofnums = 0;

        for(int i=0;i<nums.length;i++){

             ElementSumofnums = ElementSumofnums + nums[i];
             while(nums[i] != 0){
            int rem = nums[i]%10;
            DigitSum0fnums = DigitSum0fnums + rem;
            nums[i] = nums[i]/10;
             }
            
        }
       return ElementSumofnums - DigitSum0fnums ;
    }
}