/*

        Leetcode Question Number : 2544
         Alternating Digit Sum

You are given a positive integer n. Each digit of n has a sign according to the following rules:

       1) The most significant digit is assigned a positive sign.
       2) Each other digit has an opposite sign to its adjacent digits.

Return the sum of all digits with their corresponding sign.


Example 1:

Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:

Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:

Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
 

Constraints:

1 <= n <= 109



*/

package Leetcode_Series;

import java.util.Scanner;

public class AlternatingDigitSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = input.nextInt();
        int res = alternateDigitSum(N);
        System.out.println(res);
        input.close();

    }

     public static int alternateDigitSum(int n) {
        int Oddsum = 0;
        int EvenSum = 0;
        int count = 0;
        int TotalCount = 0;
        while(n!=0){
            
            int rem = n % 10;
            if(count % 2 == 0){
                EvenSum = EvenSum + rem;
                count++;
            }else{
                Oddsum = Oddsum + rem;
                count++;
            }
            n = n/10;
            TotalCount++;
        }

       return (TotalCount%2!=0) ? EvenSum - Oddsum : Oddsum - EvenSum; 

    }
}