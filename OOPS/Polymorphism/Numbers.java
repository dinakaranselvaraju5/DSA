
// Same name but types, arguments, return types amd ordering can be different.
// Poly - Many, Morphism - Way to represent it.

package OOPS.Polymorphism;

public class Numbers {

     void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(double a, int b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Numbers N1 = new Numbers();
        Numbers N2 = new Numbers();
        Numbers N3 = new Numbers();
        N1.sum(2.0,2.0);
        N2.sum(2.0, 1);
        N3.sum(1,1);



    }
}