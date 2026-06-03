package Sorting;

public class FirstansLastOccurence {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,5,5,5,5,5,5,5,5,8,8};
        int target = 8;
        System.out.println("First Occurence : " + FirstOccurence(arr,target));
        System.out.println("First Occurence : " + LastOcuurence(arr,target));

        
    }

    private static int LastOcuurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                result = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }return result;
    }

    private static int FirstOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                result = mid;
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }return result;
    }
}