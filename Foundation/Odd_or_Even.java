//Write a program to print whether a number is even or odd, also take input from the user.



import java.util.*;

public class Odd_or_Even{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int Number = input.nextInt();
         input.close();
        if(Number%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}