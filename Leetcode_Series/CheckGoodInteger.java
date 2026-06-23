

/*
        Leetcode Question Number : 3959
        Check Good Integer

You are given a positive integer n.

Let digitSum be the sum of the digits of n, and let squareSum be the sum of the squares of the digits of n.

An integer is called good if squareSum - digitSum >= 50.

Return true if n is good. Otherwise, return false.


Example 1:

Input: n = 1000

Output: false

Explanation:

The digits of 1000 are 1, 0, 0, and 0.
The digitSum is 1 + 0 + 0 + 0 = 1.
The squareSum is 12 + 02 + 02 + 02 = 1.
The squareSum - digitSum is 1 - 1 = 0. As 0 is not greater than or equal to 50, the output is false.



*/


package Leetcode_Series;

import java.util.Scanner;

public class CheckGoodInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Number : ");
        int N = input.nextInt();
        System.out.println(checkGoodInteger(N));
        input.close();
    }
    public static boolean checkGoodInteger(int n) {
        int DigitSum  = 0;
        int SquareSum = 0;
        int temp = n;
        while(temp!=0){
            int rem = temp % 10;
            DigitSum = rem + DigitSum;
            SquareSum = SquareSum + rem * rem;
            temp = temp/10;
        }
        return (SquareSum - DigitSum) >=50;
    }
}