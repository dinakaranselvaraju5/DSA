import java.util.Scanner;

public class Greeting_a_Name{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name : ");
        String Name = sc.nextLine();
        System.out.println("Heyy you are start Learning DSA - " + Name);
    }
}