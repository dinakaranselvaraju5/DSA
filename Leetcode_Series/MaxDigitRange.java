
/*

    Leetcode Question Number : 3982
    Sum of Integers with Maximum Digit Range


    You are given an integer array nums.
The digit range of an integer is defined as the difference between its largest digit and smallest digit.
For example, the digit range of 5724 is 7 - 2 = 5.
Return the sum of all integers in nums whose digit range is equal to the maximum digit range among all integers in the array.

 

Example 1:

Input: nums = [5724,111,350]
Output: 6074

Explanation:

i	nums[i] 	Largest	    Smallest	Digit Range
0	5724           7   	        2     	    5
1	111            1           	1	        0
2	350            5          	0       	5
The maximum digit range is 5. The integers with this digit range are 5724 and 350, so the answer is 5724 + 350 = 6074.

Example 2:

Input: nums = [90,900]
Output: 990

Explanation:

i	nums[i] 	Largest	    Smallest	Digit Range
0	  90	        9   	    0             9
1	  900	        9	        0             9
The maximum digit range is 9. Both integers have this digit range, so the answer is 90 + 900 = 990.

 

Constraints:
1 <= nums.length <= 100
10 <= nums[i] <= 105


*/






package Leetcode_Series;

import java.util.Arrays;

public class MaxDigitRange {

    public static void main(String[] args) {
        int[] arr = {5724,111,350,1234,56324,45555,11,1111,13000,100000};
        System.out.println(maxDigitRangemethod(arr));
    }

    // Current complexity: O(N log M)
    public static int maxDigitRangemethod(int[] nums) {
         int[] copy = Arrays.copyOf(nums, nums.length);
        int sum = 0;
        int[] temp = new int[nums.length];
        int smallest = nums[0];
        int largest = 0;
        int digitrange = 0;
        for(int i=0;i<nums.length;i++){
         smallest = Integer.MAX_VALUE;
         largest = 0;
         digitrange = 0;
           while(nums[i]!=0){
            int rem = nums[i]%10;
            if(rem < smallest){
                smallest = rem;
            }
            if(rem > largest){
                largest = rem;
            }
            
            nums[i] = nums[i]/10;
           }
           digitrange = largest - smallest;
           temp[i] = digitrange;

        }

        int findrange = 0;
        for(int i=0;i<temp.length;i++){
            if(temp[i] > findrange){
                findrange = temp[i];
            }
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i] == findrange){
                    sum = sum + copy[i];            
            }
        }

        return sum;
    }
}