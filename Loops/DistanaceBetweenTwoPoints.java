package Loops;

import java.util.Scanner;

public class DistanaceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a X1 : ");
        int x1 = input.nextInt();
        System.out.print("Enter a Y1 : ");
        int y1= input.nextInt();
        System.out.print("Enter a X2 : ");
        int x2 = input.nextInt();
         System.out.print("Enter a Y2 : ");
        int y2 = input.nextInt();
        input.close();

        double Distance = Math.sqrt(Math.pow( x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(Distance);

        
        

    }
}