
/*

    Leetcode Question Number : 169
    Majority Element

    Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3


Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
The input is generated such that a majority element will exist in the array.


*/



package Leetcode_Series;
import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {3,2,3,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3};
        int answer = majorityElement(arr);
        System.out.println(answer);
    }
    


    // Current complexity : O( N log N)
     public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int answer = n/2;
        return nums[answer];
    }
    
}