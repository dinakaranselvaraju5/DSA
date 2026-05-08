import java.util.*;

public class Odd_or_Even{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int Number = input.nextInt();
        if(Number%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}