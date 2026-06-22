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



/*

That line is a safety check to make sure the reversed number still fits inside Java’s int range. Let’s break it down:

Java int range

        Integer.MAX_VALUE = 2,147,483,647
        Integer.MIN_VALUE = -2,147,483,648

Any number outside this range cannot be stored in an int.

        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
    return 0;
}

    reverse > Integer.MAX_VALUE → checks if the reversed number is too large (overflow).
    reverse < Integer.MIN_VALUE → checks if the reversed number is too small (underflow).

If either condition is true, the function returns 0 instead of trying to cast the out‑of‑range long into an int (which would cause incorrect results).

 Why it’s needed
You declared reverse as a long so it can temporarily hold values bigger than int.
But before returning, you cast it back to int. If the reversed number doesn’t fit in int, this check prevents overflow errors by returning 0.

    x = 1534236469
    reverse = 9646324351  // too big for int

    Since 9646324351 > Integer.MAX_VALUE, the method returns 0.
    That line ensures the reversed number is valid within the int range. If not, it safely returns 0 instead of producing a wrong or overflowed value.

*/