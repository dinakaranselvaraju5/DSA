package Functions;

import java.util.Scanner;

public class GradeCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Mark : ");
        int Mark = input.nextInt();
        CheckGrade(Mark);
        input.close();
    }

//     Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail
    private static void CheckGrade(int mark) {
      
        if(mark >= 91 && mark <= 100 ){
            System.out.println("AA");
        }else if(mark >= 81 && mark <= 90){
            System.out.println("AB");
        }else if(mark >= 71 && mark <= 80){
            System.out.println("BB");
        }else if(mark >= 61 && mark <= 70){
            System.out.println("BC");
        }else if(mark >= 51 && mark <= 60){
            System.out.println("CD");
        }else if(mark >= 41 && mark <= 50){
            System.out.println("DD");
        }else{
            System.out.println("Fail");
        }
        
    }
}