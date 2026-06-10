package Arrays;

import java.util.Arrays;

public class RightRotateArray {

    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,10,11};
        int k = 3;
       int N = nums.length;
        k = k % N;
        RightRotate(nums,N - k, N - 1);
        RightRotate(nums,0,N - k - 1);
        RightRotate(nums,0,N - 1);

        System.out.println(Arrays.toString(nums));



    }

    public static void RightRotate(int[] nums, int Start, int End){
        while(Start <= End){
            int temp = nums[Start];
            nums[Start] = nums[End];
            nums[End] = temp;
            Start++;
            End--;
        }
    }
}
