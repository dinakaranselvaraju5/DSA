
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)




// import java.util.*;

// public class Operators {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter a Number1 : ");
//         int Num1 = input.nextInt();
//         System.out.println("Enter a Number2 : ");
//         int Num2 = input.nextInt();

//         int add = Num1 + Num2;
//         System.out.println("Add is " + add);
//         int Sub = Num1 - Num2;
//         System.out.println("Sub is " + Sub);
//         int Mul = Num1 * Num2;
//         System.out.println("Mul is " + Mul);
//         int Div = Num1/Num2;
//         System.out.println("Div is " + Div);
//         int modulas = Num1%Num2;
//         System.out.println("Mod is " + modulas);

//     }
// }



import java.util.*;



public class Operators{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Num1 : ");
        double Num1 = input.nextDouble();
        System.out.println("Enter a Num2 : "); 
        double Num2 = input.nextDouble();

        System.out.println("Enter a Simple [ +,-,*,/]");
        char op = input.next().charAt(0);
         input.close();
        if(op == '+'){
            System.out.println("Result = " + (Num1 + Num2));
        }else if(op == '-'){
            System.out.println("Result = " + (Num1 - Num2));
        }else if (op == '*'){
            System.out.println("Result = " + (Num1 * Num2));
        }else if(op == '/'){
            if(Num2!=0){
                System.out.println("Result = " + Num1/Num2);
            }else{
                System.out.println("Divison by Zero is Not Allowed");
            }
        }
        else{
            System.out.println("Invalid Operator");
        }
    }
}