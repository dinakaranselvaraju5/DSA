package OOPS.Abstract;

public class son extends Parent {
    @Override
    void carrer(String Name) {
        System.out.println("I will became an " + Name);
    }
    @Override
    void partner(String Name, int age){
        System.out.println("My Lover name is " + Name + " her age is " + age);
    }
    
}