package OOPS.Inheritance;

public class Box {

        //System.out.println("Heyy");
        double l;
        double b;
        double h;
    

    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }
    Box(double Size){
        this.l = Size;
        this.h = Size;
        this.b = Size;
    }
    Box(double x, double y, double z){
        this.l = x;
        this.b = y;
        this.h = z;
    }
    Box(Box Copy){
        this.l = Copy.l;
        this.b = Copy.b;
        this.h = Copy.h;
    }
}