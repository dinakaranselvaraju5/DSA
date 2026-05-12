package Loops;

import java.util.Scanner;

public class Sum_of_Digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = input.nextInt();
        input.close();
        int sum = 0;

        while(N>0){
            sum = sum + N%10;
            N = N/10;
        }
        System.out.println(sum);
    }
}