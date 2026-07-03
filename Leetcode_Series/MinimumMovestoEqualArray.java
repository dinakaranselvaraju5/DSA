
/*
    Leetcode Question Number : 3736
    Minimum Moves to Equal Array Elements III


    You are given an integer array nums.

In one move, you may increase the value of any single element nums[i] by 1.
Return the minimum total number of moves required so that all elements in nums become equal.

 

Example 1:

Input: nums = [2,1,3]
Output: 3

Explanation:

To make all elements equal:
Increase nums[0] = 2 by 1 to make it 3.
Increase nums[1] = 1 by 1 to make it 2.
Increase nums[1] = 2 by 1 to make it 3.
Now, all elements of nums are equal to 3. The minimum total moves is 3.

Example 2:

Input: nums = [4,4,5]
Output: 2

Explanation:

To make all elements equal:
Increase nums[0] = 4 by 1 to make it 5.
Increase nums[1] = 4 by 1 to make it 5.
Now, all elements of nums are equal to 5. The minimum total moves is 2.

 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100

*/



package Leetcode_Series;

public class MinimumMovestoEqualArray {

    public static void main(String[] args) {
        int[] arr = {2,16,7,8,3,3,55,66,77,88,24,2,3};
        int answer = minMoves(arr);
    }

    public static int minMoves(int[] nums) {
        int max = 0;
         int count = 0;
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }

    for(int i=0;i<nums.length;i++){
        count = count + (max - i);
    }
        return count;
    }

    /*
    Optmized one
    for (int num : nums) {
        count += (max - num);
    }

    Brutte force
    // for(int i=0;i<nums.length;i++){
           
        //     while(nums[i] != max){
        //         nums[i]++;
        //         count++;
        //     }
        // }
    
    */
    
}