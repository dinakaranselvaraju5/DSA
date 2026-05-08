import java.util.Scanner;

public class LargestNumber {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number1 : ");
        int Num1 = input.nextInt();
        System.out.print("Enter a Number 2 : ");
        int Num2 = input.nextInt();
        input.close();

        if(Num1 > Num2){
            System.out.println("Largest Number is " + Num1);
        }else{
            System.out.println("Largest Number is " + Num2);
        }
     }
}