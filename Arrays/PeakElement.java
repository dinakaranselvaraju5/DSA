package Arrays;

public class PeakElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        // code here
        int Largest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[Largest]){
                Largest = i;
            }
        }
        if(( Largest == 0 || arr[Largest - 1] < arr[Largest])&& (Largest == arr.length - 1 || arr[Largest] > arr[Largest + 1])){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        /* 
            Left Side: (Largest == 0 || arr[Largest] > arr[Largest - 1])
        If Largest == 0 → means the element is at the first index.

        In that case, it has no left neighbor, so we automatically consider it valid.

        Otherwise → check if arr[Largest] > arr[Largest - 1].

        This ensures the element is greater than its left neighbor.

        Right Side: (Largest == arr.length - 1 || arr[Largest] > arr[Largest + 1])
        If Largest == arr.length - 1 → means the element is at the last index.

        In that case, it has no right neighbor, so we automatically consider it valid.

        Otherwise → check if arr[Largest] > arr[Largest + 1].

        This ensures the element is greater than its right neighbor.

        */

    }
}