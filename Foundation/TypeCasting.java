import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int Number = input.nextInt();
        input.close();

        float Num = (float)(Number);
        System.out.println(Num);


        // Byte 

        int N = 26;
        byte value = (byte)(N);
        System.out.println(value);

        int C = 'A';
        System.out.println(C);
    }
}





// Destination type should greater than the Source type. Type casting will Work