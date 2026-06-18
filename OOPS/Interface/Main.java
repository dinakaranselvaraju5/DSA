package OOPS.Interface;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.a);
        car.accelerate();
        car.brake();
        car.start();
        car.stop();
    }
}