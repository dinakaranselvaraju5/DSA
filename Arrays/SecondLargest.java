package Arrays;

import java.util.Arrays;

public class SecondLargest {

public static void main(String[] args) {
        int[] arr = {2,5,22,679,98,1,7,14};
        int[] Answer = new int[2];
        Answer[0] = SecondLargest(arr);
        Answer[1] = SecondSmallest(arr);
        System.out.println(Answer[0]);
        System.out.println(Answer[1]);
        System.out.println(Arrays.toString(Answer));
}

private static int SecondLargest(int[] arr) {
    int Largest = arr[0];
    int SLargest = -1;
    for(int i=0;i<arr.length;i++){
        if(arr[i] > Largest){
            SLargest = Largest;
            Largest = arr[i];
        }else if(arr[i] > SLargest && arr[i]< Largest){
            SLargest = arr[i];
        }
    }
   return SLargest;
}

private static int SecondSmallest(int[] arr) {
    int INT_MAX = Integer.MAX_VALUE;
    int Smallest = arr[0];
    int SSmallest = INT_MAX;
    for(int i=0;i<arr.length;i++){
        if(arr[i] < Smallest){
            SSmallest = Smallest;
            Smallest = arr[i];
        }else if(arr[i] < SSmallest && arr[i] > Smallest){
            SSmallest = arr[i];
        }
    }return SSmallest;
}







    //public static void main(String[] args) {
    //     int[] arr = {3,9,6,48,12,45};
        
    //     int Largest = arr[0];
    //     int SecondLargest = -1;

    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i] > Largest){
    //             Largest = arr[i];
    //         }
    //     }

    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i] > SecondLargest && arr[i] != Largest){
    //             SecondLargest = arr[i];
    //         }
    //     }

    //     System.out.println(SecondLargest);
    // }
}