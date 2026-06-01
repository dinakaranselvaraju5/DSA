package Sorting;

public class CeillingNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 9;
        int Ans = BinarySearch(arr,target);
        System.out.println("Answer : " + Ans);
    }

    private static int BinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
             mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }      
        }return left ;

    }
}





// private static int BinarySearch(int[] arr, int target) {
//     int left = 0;
//     int right = arr.length - 1;
//     while (left <= right) {
//         int mid = left + (right - left) / 2;
//         if (arr[mid] == target) {
//             return arr[mid]; // return the value, not index
//         } else if (arr[mid] < target) {
//             left = mid + 1;
//         } else {
//             right = mid - 1;
//         }
//     }
//     // If left == arr.length, no ceiling exists
//     return (left < arr.length) ? arr[left] : -1;
// }
