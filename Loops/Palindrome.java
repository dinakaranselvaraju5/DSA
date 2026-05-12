package Loops;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = input.nextInt();
        int Original = N;
        input.close();
        
        int sum = 0;
        while (N>0) {
             int rev =  N % 10;
             sum =sum*10 + rev;
             N=N/10;
             
        }
        if(Original == sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}