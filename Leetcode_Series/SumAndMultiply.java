
/*

    Leetcode Question Number : 3754 
    Concatenate Non-Zero Digits and Multiply by Sum I


    You are given an integer n.
Form a new integer x by concatenating all the non-zero digits of n in their original order. If there are no non-zero digits, x = 0.
Let sum be the sum of digits in x.
Return an integer representing the value of x * sum.

 

Example 1:

Input: n = 10203004
Output: 12340

Explanation:

The non-zero digits are 1, 2, 3, and 4. Thus, x = 1234.
The sum of digits is sum = 1 + 2 + 3 + 4 = 10.
Therefore, the answer is x * sum = 1234 * 10 = 12340.


Example 2:

Input: n = 1000
Output: 1

Explanation:

The non-zero digit is 1, so x = 1 and sum = 1.
Therefore, the answer is x * sum = 1 * 1 = 1.
 

Constraints:
0 <= n <= 10^9


*/




package Leetcode_Series;

import java.util.Scanner;

public class SumAndMultiply {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = input.nextInt();
        System.out.println(sumAndMultiplymethod(N));
        input.close();
    }

    public static long sumAndMultiplymethod(int n) {
        long temp = n;
        long temp1 = n;
        long sumcount = 0;
        long sumcount1 = 0;
        long ans = 0;
        while(temp!=0){
            long rem = temp%10;
            sumcount = sumcount + rem;
            temp = temp/10;
        }

        while(temp1!=0){
            long rem = temp1%10;
            if(rem!=0){
                   sumcount1 = sumcount1*10 + rem;
            }
            temp1 = temp1/10;
        }

        long sumcount2 = 0;
        while(sumcount1!=0){
            long rem = sumcount1%10;
            sumcount2 = sumcount2*10 + rem;
            sumcount1 = sumcount1/10;
        }

        return sumcount2 * sumcount;
    }
}