package Loops;

import java.util.Scanner;

public class Batting_Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Total Score : ");
        int Total_Score = input.nextInt();
        System.out.print("Enter a No_of_Innings : ");
        int No_of_Innings = input.nextInt();
        input.close();

        double Average = (double)Total_Score/No_of_Innings;
        System.out.printf("%.2f",Average);
    }
}