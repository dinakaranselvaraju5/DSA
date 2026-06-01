package Sorting;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 14;
        int Ans = Searching(arr,target);
       System.out.println("Index of the target : " + Ans);
    }

    private static int Searching(int[] arr, int target) {
       int left = 0;
       int right = arr.length - 1;
       while (left<=right) {
            int mid = left + (right - left)/2;
        if(arr[mid] == target)
            return mid;
        else if(arr[mid] < target)
            left = mid + 1;
        else
            right = mid - 1;
       }  
       
       return -1;
    }
}