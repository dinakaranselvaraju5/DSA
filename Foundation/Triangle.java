import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Length and Breath ");
        int Length = input.nextInt();
        int Breath = input.nextInt();
        input.close();
        double Area = 0;
     Area = 0.5 * Length * Breath;
        System.out.println(Area);
    }
}