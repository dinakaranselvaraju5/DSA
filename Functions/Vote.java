package Functions;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Age : ");
        int Age = input.nextInt();
        input.close();

        VoteChecking(Age);


    }

    private static void VoteChecking(int age) {
        // TODO Auto-generated method stub
        if(age >=18){
            System.out.println("Eligible for Vote ");
        }else{
            System.out.println("Not Eligible ");
        }
    }
}