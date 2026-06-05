package OOPS.Inheritance;

public class BoxWeigth extends Box{
    public double weigth;
    BoxWeigth(){
        this.weigth = -1;
    }
    public BoxWeigth(double Length, double Breath, double Height, double weigth){
        super(Length,Breath,Height); // Call from parent class constructor
        //super is used inside a child class constructor to call the parent class’s constructor.
        this.weigth = weigth;
    }
}