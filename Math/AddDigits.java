package Math;

public class AddDigits {

    public static void main(String[] args) {
        int N = 199;
        int ans =  FindDigit(N);
        while(ans >=10){
            ans= FindDigit(ans);
        }
        System.out.println(ans);
    }

    public static int FindDigit(int num){
        int count = 0;
         while(num!=0){

            int rem = num % 10;
            count = count + rem;
            num = num/10;
        }
        return count;
    }
}