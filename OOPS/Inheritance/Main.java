package OOPS.Inheritance;

public class Main {

    public static void main(String[] args) {
        // Box B = new Box(4.6,7.9,10.0);
        // Box B1 = new Box();
        // Box B2 = new Box(B1);
        // System.out.println(B.l + " " + B.b + " " + B.h );
        // System.out.println();
        //  System.out.println(B2.l + " " + B2.b + " " + B2.h );

        BoxWeigth B3 = new BoxWeigth();
        BoxWeigth B4 = new BoxWeigth(12.5,11.5,9.0,100.0);
        System.out.println(B3.l + " " + B3.weigth);
        System.out.println();
        System.out.println(B4.l + " " + B4.h + " " + B4.l + " " + B4.weigth);
    }
}