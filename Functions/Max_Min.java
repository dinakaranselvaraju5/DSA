package Functions;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int N1 = input.nextInt();
        System.out.print("Enter Num 2 : ");
        int N2 = input.nextInt();
        System.out.print("Enter Num 3 : ");
        int N3 = input.nextInt();

        int Largets = Largest(N1,N2,N3);
        System.out.println("Largest Number : " + Largets);
        int Smallest = Smallest(N1,N2,N3);
        System.out.println("Smallest Number : " + Smallest);
        input.close();

    }

    static int Largest(int n1, int n2, int n3){

        int max = n1;
        if(max < n2){
            max = n1;
        }if(max < n3){
            max = n2;
        }

        return max;
    }


     static int Smallest(int n1, int n2, int n3){

        int min = n1;
        if(min > n2){
            min = n2;
        }if(min > n3){
            min = n3;
        }

        return min;
    }
}

/* 
// Shortest Version

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        sc.close();
    }
}  */