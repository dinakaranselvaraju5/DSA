package Leetcode_Series;

/**
 * MaximumSubarray
 */
public class MaximumSubarray {
    
  
    public static  int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        
        int maxSum = nums[0];
        int minPrefix = 0; // smallest prefix before current index
        
        for (int i = 0; i < n; i++) {
            // subarray sum ending at i = prefix[i] - minPrefix
            maxSum = Math.max(maxSum, prefix[i] - minPrefix);
            // update minPrefix
            minPrefix = Math.min(minPrefix, prefix[i]);
        }
        
        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr ={};
        int ans = maxSubArray(arr);
    }
}