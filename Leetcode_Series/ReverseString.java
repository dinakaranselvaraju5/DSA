
/*

Leetcode Question Number : 344. 
Reverse String


Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.


*/


package Leetcode_Series;

import java.util.Arrays;

public class ReverseString {
    
    public static  void reverseStringgg(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        char[] input = {'D','I','N','A'};
        reverseStringgg(input);

    }
}