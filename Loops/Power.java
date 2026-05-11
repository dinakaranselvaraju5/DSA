package Loops;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = input.nextInt();
        input.close();
        System.out.println(Math.pow(N, 2));
    }
}