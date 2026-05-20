package Arrays;

import java.util.*;

class RunningSum{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        int[] Ans = new int[nums.length];
        Ans[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            Ans[i] = Ans[ i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(Ans));
    }
}