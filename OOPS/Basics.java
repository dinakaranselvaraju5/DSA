package OOPS;
import Functions.GradeCalculation;
public class Basics {

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj);
       // GradeCalculation F = new GradeCalculation();
        GradeCalculation.CheckGrade(100);
        
    }
    static class A{
        int a;
        String Name;
        A(){

        }
        
    }
}

