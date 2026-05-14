package Functions;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = input.nextInt();
        input.close();

        CheckPrime(N);
    }

    public static void CheckPrime(int Num){
        int count = 0;
        if(Num == 1 ){
            System.out.println("Neither Prime Nor Composite");
        }
        for(int i=2;i<Math.sqrt(Num);i++){
            if(Num%i == 0){
                count ++;
                
            }
        }

        if(count>0){
            System.out.println("Not Prime Number");
        }else{
            System.out.println("Prime Number");
        }
        
    }
}