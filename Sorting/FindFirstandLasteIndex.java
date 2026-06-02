package Sorting;

import java.util.Arrays;

public class FindFirstandLasteIndex {

    public static void main(String[] args) {
        int[] nums = {1,2,4,4,4,4,7,7,7,9};
        int target = 7;

        Search(nums,target);
           
        
    }

    private static void Search(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] =  SearchIndex(nums,target,true);
        
       if(ans[0] != -1)
            ans[1] = SearchIndex(nums,target,false);

       //System.out.println(ans[0]);
        
        System.out.println(Arrays.toString(ans));
    }

    private static int SearchIndex(int[] nums, int target, boolean findIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }
                    
            else if (nums[mid] > target){
                end = mid - 1;
            }
                    
            else{
                ans = mid;
                if(findIndex){
                         end = mid - 1;
                    }                       
                    else{
                        start = mid + 1;
                    }
            }                    
                        
        }
       return ans;
    }
}