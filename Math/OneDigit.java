package Math;

public class OneDigit {

    public static void main(String[] args) {
        int n  = 824883294;
        int temp = n;
        int count = 0;

        while(temp!=0){
            n = temp;
                while(n!=0){
                int rem = n % 10;
                if(rem == 1){
                    count++;
                }
                n = n/10;
                }
            temp = temp - 1;
        }
        
        System.out.println(count);
    }

    
}