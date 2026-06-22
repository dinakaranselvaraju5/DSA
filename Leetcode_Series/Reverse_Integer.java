 // Leetcode Question Number : 7 
 // Reverse Integer

/*
        Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

*/

package Leetcode_Series;

import java.util.*;

public class Reverse_Integer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = input.nextInt();
        int result = reverse(N);
        System.out.println(result);
        input.close();
    }
    public static int reverse(int x) {
        long reverse = 0;
        while(x!=0){
            int rem = x%10;
            reverse = reverse*10 + rem;
            x=x/10;
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        return (int) reverse;
    }
}