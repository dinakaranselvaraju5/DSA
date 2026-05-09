import java.util.Scanner;

public class Parallelogram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Base : ");
        int Base = input.nextInt();
        System.out.print("Enter a Height : ");
        int Height = input.nextInt();
        input.close();
        int Area = Base * Height;
        System.out.println(Area);
    }
}