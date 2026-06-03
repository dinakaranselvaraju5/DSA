package Sorting;

public class RBS {

    public static void main(String[] args) {
        
        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;
        FinalAnswer(nums,target);        
    }

    private static void FinalAnswer(int[] nums,int target) {
        int ans = FindPivot(nums);
        if(ans == -1){
            System.out.println(Search(nums, target, 0, nums.length - 1));
        }
       // System.out.println(ans);
        if(nums[ans] == target){
            System.out.println(ans);
        }else if(nums[0] <= target){
            System.out.println(Search(nums, target, 0, ans - 1));
        }else{
                 System.out.println(Search(nums, target, ans + 1, nums.length - 1));
        }
        
            
    }



    private static int Search(int[] arr, int target,int start,int end) {
        // int start = 0;
        // int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
                
        }
        return -1;
    }

    private static int FindPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
}