package OOPS;

// Constructor is a special function, that runs when you create an object and it allocates some varibale as you like it.


public class Constructor {

    public static void main(String[] args) {

        //Student Dina = new Student();
        Student Ram = new Student(129,"Rammmm",75.5f);
        System.out.println(Ram.RollNo);
        System.out.println(Ram.Name);
        System.out.println(Ram.Mark);


         Student Joe = new Student(); //  <-------- Default Constructor
         // Provided automatically by the compiler if no constructor is explicitly defined.
         System.out.println(Joe.RollNo);
         System.out.println(Joe.Name);
         System.out.println(Joe.Mark);



         Student CopyConstructor = new Student(Joe); // Copy Constructor
         System.out.println();
         System.out.println(CopyConstructor.RollNo);
         System.out.println(CopyConstructor.Name);
         System.out.println(CopyConstructor.Mark);

        


        
      //  Dina.ChangeName("Devil Dina");
        // Dina.Greet();
        
    }

    static class Student{
        int RollNo;
        String Name;
        double Mark;
       void ChangeName(String name){
           Name = name;
        }
        void Greet(){
            System.out.println("Heyyy youre name is " + this.Name);
        }
        
        // No-Argument Constructor
        // Explicitly defined by the programmer with no parameters.
        Student(){
            this.RollNo = 130;
            this.Name = "Joe";
            this.Mark = 100.0;
        }

        // Parameterized Constructor
       // Accepts parameters to initialize object fields with user-defined values.        
        Student(int RN, String N, float M){
            this.RollNo = RN;
            this.Name = N;
            this.Mark = M;
        }
            
        // Copy Constructor
        // Takes another object of the same class as a parameter and copies its values.

        Student(Student s){
            this.RollNo = s.RollNo;
            this.Name = s.Name;
            this.Mark = s.Mark;
        }
        
    }
}