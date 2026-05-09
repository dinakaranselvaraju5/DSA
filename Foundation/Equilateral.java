import java.util.Scanner;

public class Equilateral {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // a = Length of each side of an equilateral triangle
        System.out.print("Enter a Length of each side of an equilateral triangle : ");
        int a = input.nextInt();
        input.close();
        double Area = (Math.sqrt(3)/4 )* a * a;
        System.out.println(Area);
    }
}