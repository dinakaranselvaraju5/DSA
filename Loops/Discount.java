package Loops;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        // Original Price and Discount equal to Selling Price
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a Price Amount : ");
        // double Original_Price = input.nextDouble();
        // System.out.print("Enter a Discount Percentage : ");
        // double Dicount = input.nextDouble();
        // double Answer = Original_Price - (Original_Price * Dicount/100);
        // System.out.println(Answer);
        // input.close();


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Marked Price : ");
        double Marked_Price = input.nextDouble();
        System.out.print("ENter a Selling Price : ");
        double Selling_Price = input.nextDouble();
        input.close();
        double Discount = Marked_Price - Selling_Price;
        double Discount_Percentage = (Discount/Marked_Price) * 100;
        System.out.println("Discount Amount : " + Discount);
        System.out.println("Discount Percentage : " + Discount_Percentage + "%");
    }
}