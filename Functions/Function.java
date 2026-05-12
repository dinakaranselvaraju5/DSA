package Functions;

import java.util.*;
 public class Function {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Sum();
        // int Answer = Subract();
        // System.out.println("Subract : " + Answer);
        // int Ans = Multiply(10, 20);
        // System.out.println("Multiply : " + Ans);
         System.out.print("Enter a Name : ");
         String Name = input.nextLine();
         String Result = Greeeting(Name);
         System.out.println(Result);
          input.close();
    }


    // // Everything inside a Function 

    //  static void Sum(){
        
    //     System.out.print("Enter a Number 1 : ");
    //     int N1 = input.nextInt();
    //     System.out.print("Enter a Number 2 : ");
    //     int N2 = input.nextInt();
      
    //     int Ans = N1 + N2;
    //     System.out.println("Addition : " + Ans);
        

    // }  

    // // Using int to return the value

    //     static int Subract (){
            
    //     System.out.print("Enter a Number 1 : ");
    //     int N1 = input.nextInt();
    //     System.out.print("Enter a Number 2 : ");
    //     int N2 = input.nextInt();
    //     int Ans = N1 - N2;
    //     return Ans;
    //     }

    //     // Using Paramters
    //     static int Multiply(int A, int B){
    //         int ans = A * B;
    //         return ans;
    //     }


        // String Input 
        static String Greeeting(String Name){
            String Ans = "Heyyy " + Name;
            return Ans;
        }
       
    
}