// To calculate Fibonacci Series up to n numbers.


import java.util.Scanner;

public class Fibonacci_Series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number of Series : ");
        int N = input.nextInt();
        input.close();
        int First = 0;
        int Second = 1;
       
        
        for(int i=0;i<N;i++){
            System.out.print( " " + First);
            int Third = First + Second;
            First = Second;
            Second = Third;

            
        }
    }
}