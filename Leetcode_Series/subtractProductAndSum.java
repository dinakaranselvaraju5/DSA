
/*

    Leetcode Question Number : 1281
     Subtract the Product and Sum of Digits of an Integer

    Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

Example 1:

Input: n = 234
Output: 15 

Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15


Example 2:

Input: n = 4421
Output: 21

Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 

Constraints:
1 <= n <= 10^5

*/



package Leetcode_Series;

import java.util.Scanner;

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = input.nextInt();
        System.out.println(subtractProductAndSummm(n));
        input.close();

    }

    public static int subtractProductAndSummm(int n) {
        int Productofdigits = 1;
        int Sumofdigits = 0;

        while(n!=0){
            int rem = n % 10;
            Productofdigits = Productofdigits  * rem;
            Sumofdigits = Sumofdigits + rem ;
            n = n/10;
        }

        return Productofdigits - Sumofdigits;
    }
    
}