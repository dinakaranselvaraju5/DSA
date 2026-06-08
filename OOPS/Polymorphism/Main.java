package OOPS.Polymorphism;

public class Main {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shapes.Area();
        circle.Area();
        square.Area();
        triangle.Area();
        
    }
}