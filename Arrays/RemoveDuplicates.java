package Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        
        // Using Two Pointer Pattern

        int[] nums = {1,1,1,2,2,2,3,4,4,4,4,4,4,4,4,4,6};

        int i = 0;
        for(int j = 1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                nums[i + 1] = nums[j];
                i++;
            }
        }

        System.out.println(i + 1);
    }
}