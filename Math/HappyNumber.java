package Math;


public class HappyNumber {

    public static void main(String[] args) {
        int n = 19;
        int slow = n;
        int fast = HappyNumber(n);

        while (fast != 1 && slow != fast) {
            slow = HappyNumber(slow);
            fast = HappyNumber(HappyNumber(fast));
        }

        if (fast == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
     

    }

    static int HappyNumber(int sum){
        int res = 0;
        while(sum!=0)
        {
            int rem = sum % 10;
            res = res + rem * rem;
            sum = sum/10;
        }

        return res;
    }
       
    }

    
