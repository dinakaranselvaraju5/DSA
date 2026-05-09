package Loops;

import java.util.Scanner;

   // TNEB  Units Consumed (2 months)	Rate Per Unit
// 0 – 100	Free
// 101 – 200	₹2.35
// 201 – 400	₹4.70
// 401 – 500	₹6.30
// 501 – 600	₹8.40
// 601 – 800	₹9.45
// 801 – 1000	₹10.50
// Above 1000	₹11.55

public class Electricity_Bill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Unit : ");
        double Unit = input.nextDouble();
        input.close();
        if(Unit <= 100){
            System.out.println("The Bill Amount is 0 ");
        }else if(Unit >= 101 && Unit <= 200 ){
           System.out.println("The Bill Amount is  " + Unit * 2.35);
        }else if(Unit >= 201 && Unit <= 400 ){
            System.out.println("The Bill Amount is  " + Unit * 4.70);
        }else if(Unit >= 401 && Unit <= 500 ){
            System.out.println("The Bill Amount is  " + Unit * 6.30);
        }else if(Unit >= 501 && Unit <= 600 ){
            System.out.println("The Bill Amount is  " + Unit * 8.40);
        }else if(Unit >= 601 && Unit <= 800 ){
            System.out.println("The Bill Amount is  " + Unit * 9.45);
        }else if(Unit >= 801 && Unit <= 1000 ){
            System.out.println("The Bill Amount is  " + Unit * 10.50);
        }else{
            System.out.println("The Bill Amount is  " + Unit * 11.55);
        }
    }
}







// Advanced Version 


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter units consumed: ");
//         int units = sc.nextInt();

//         double bill = 0;

//         if (units <= 100) {
//             bill = 0;
//         }
//         else if (units <= 200) {
//             bill = (units - 100) * 2.35;
//         }
//         else if (units <= 400) {
//             bill = (100 * 2.35) +
//                    ((units - 200) * 4.70);
//         }
//         else if (units <= 500) {
//             bill = (100 * 2.35) +
//                    (200 * 4.70) +
//                    ((units - 400) * 6.30);
//         }
//         else if (units <= 600) {
//             bill = (100 * 2.35) +
//                    (200 * 4.70) +
//                    (100 * 6.30) +
//                    ((units - 500) * 8.40);
//         }
//         else if (units <= 800) {
//             bill = (100 * 2.35) +
//                    (200 * 4.70) +
//                    (100 * 6.30) +
//                    (100 * 8.40) +
//                    ((units - 600) * 9.45);
//         }
//         else if (units <= 1000) {
//             bill = (100 * 2.35) +
//                    (200 * 4.70) +
//                    (100 * 6.30) +
//                    (100 * 8.40) +
//                    (200 * 9.45) +
//                    ((units - 800) * 10.50);
//         }
//         else {
//             bill = (100 * 2.35) +
//                    (200 * 4.70) +
//                    (100 * 6.30) +
//                    (100 * 8.40) +
//                    (200 * 9.45) +
//                    (200 * 10.50) +
//                    ((units - 1000) * 11.55);
//         }

//         System.out.println("Electricity Bill = ₹" + bill);
//     }
// }
// ```
