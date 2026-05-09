import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // d1 and d2 are Diagonals
        System.out.print("Enter a Diagonal 1 : ");
        int d1 = input.nextInt();
        System.out.print("Enter a Diagonal 2 : ");
        int d2 = input.nextInt();
        input.close();

        double Area = 0.5 * d1 *d2;
        System.out.println(Area);
    }
}