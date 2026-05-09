package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Nth Factorial Value : ");
        long N = input.nextInt();
        input.close();
        long sum = 1;
        for(long i = N; i!=0;i--){
            sum =  sum * i;
        }

        System.out.println(sum);
    }
}
