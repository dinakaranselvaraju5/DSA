import java.util.Scanner;

public class Isosceles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Equal Sides : ");
        double Equal_Side = input.nextDouble();
        System.out.print("Enter a Base : ");
        double Base = input.nextDouble();
        input.close();

        double Area = Base/4 *Math.sqrt((4 * Equal_Side * Equal_Side) - (Base * Base));
        System.out.println(Area);

    }
}