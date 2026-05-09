import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Temperature in Celsius : ");
        float tempC = input.nextFloat();
        input.close();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in Celsius to fahrenheit " + tempF);
    }
}