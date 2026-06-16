public class Dg {

    public static void main(String[] args) {
        int[] nums = {9,1,18};
        int Alice = 0;
        int Bob = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] <= 9){
                Alice = Alice + nums[i];
            }else{
                Bob = Bob + nums[i];
            }
        }

        if(Alice < Bob){
            int temp = Bob;
            Bob = Alice;
            Alice = temp;
            
        }
       if(Alice > Bob){
        System.out.println("True");
       }else{
        System.out.println("False");
       }
    }
}