
/*

        Fibonacci Number
    Leetcode Question Number : 509
       
    The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

        F(0) = 0, F(1) = 1
        F(n) = F(n - 1) + F(n - 2), for n > 1.
        Given n, calculate F(n).


*/


package Leetcode_Series;

import java.util.*;
public class Fibonacci_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = input.nextInt();
        N = Fibonacci(N);
        System.out.println("The Nth Fibonacci Number : " + N);
        input.close();
    }

    public static int Fibonacci(int n) {
        int first = 0;
        int second = 1;
        int third = first + second;
        if(n == 0)
            return 0;
        for(int i = 1;i<n;i++){
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
}