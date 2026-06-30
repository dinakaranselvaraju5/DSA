

/*
    Leetcode Question Number : 258 
    Add Digits

    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0
 
Constraints:
0 <= num <= 2^31 - 1



*/


package Leetcode_Series;

import java.util.Scanner;

public class AddDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        System.out.println( addDigits(num));
        input.close();
    }


    // Optimized Approach O(1)
        public static int addDigits(int num) {
        if (num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }

}
    /* 

    Loops/Recursion Method Time Complexity : O(log N)

    public static int addDigits(int num) {
        int ans = FindDigit(num);
        while(ans>=10){
            ans= FindDigit(ans);
        }
        return ans;
    }

    static int FindDigit(int num){
        int count = 0;
         while(num!=0){

            int rem = num % 10;
            count = count + rem;
            num = num/10;
        }
        return count;
    }

     */
