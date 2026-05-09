import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Length and Breath : ");
        int Length = input.nextInt();
        int Breath = input.nextInt();
        input.close();

        int Area = Length * Breath;
        System.out.println(Area);

    }
}