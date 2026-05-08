import java.util.Scanner;

public class Simple_Interest {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Principle :");
        double Principle = input.nextDouble();
        System.out.println("Enter an Interest : ");
        double Interest = input.nextDouble();
        System.out.println("Enter a Time : ");
        double Time = input.nextDouble();
        input.close();

        double SI = (Principle * Interest *Time)/100;
        System.out.println("The Simple Interest is " + SI);
     }
}