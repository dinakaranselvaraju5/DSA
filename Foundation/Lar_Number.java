import java.util.Scanner;

public class Lar_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three numbers : ");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        input.close();

        int Max = A;
        if(Max < B){
            Max = B;
        }else if( Max < C){
            Max = C;
        }

        System.out.println(Max);

    }
}