// Input currency in rupees and output in USD.


import java.util.Scanner;

public class USD_Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a INR Amount : ");
        double INR = input.nextDouble();
        input.close();
        double USD = (INR/94.40);
        System.out.printf("USD is %.2f" ,USD);
    }
}