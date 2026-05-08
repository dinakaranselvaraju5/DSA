import java.util.Scanner;

public class AmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = input.nextInt();
        input.close();
        int Original = N;
        int Sum = 0;
        while (N > 0) {
            int digit = N % 10;
            Sum = Sum + (digit*digit*digit);
            N = N/10;
        }
        if(Original == Sum){
            System.out.println("The Given Number is Armstrong ");
        }else{
            System.out.println("The Given Number is Not an Arsmstrong ");
        }
    }
}