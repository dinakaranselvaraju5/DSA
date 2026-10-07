package Math;

import java.util.Arrays;

/**
 * PairSum
 */
public class PairSum {

    public  static  int[] OptimalFindPairSum(int[] arr, int target){

            Arrays.sort(arr);

            int start = 0;
            int end = arr.length - 1;
            while(start < end){
                int mid = arr[start] + arr[end];

                if(mid == target){
                    return new int[]{start,end};
                }else if(mid < target){
                    start++;
                }else{
                    end--;
                }
            }
            
        

        return new int[] {-1,-1};
    }

    public  static  int[]  FindPairSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j = i + 1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {5,8,4,9,2,8,8};
      int[] ans = OptimalFindPairSum(arr,16);
     Arrays.sort(arr);
     System.out.println(Arrays.toString(arr));
      for(int i=0;i<ans.length;i++){
        System.out.print(ans[i] + " ");
      }

    }
}