import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        input.close();
        double Area = Math.PI * R * R;
        System.out.println("Area of the Circle is " + Area);
    }
}