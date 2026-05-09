package Loops;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        double N = input.nextDouble();
        input.close();

        double Answer = (N * (N + 1))/2;
        System.out.println(Answer/N);
    }
}