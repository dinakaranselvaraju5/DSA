package Math;



public class Powoftwo {

    public static void main(String[] args) {
        int n = 8;
            int count = 0;
          int temp = n;
        int res = 0;
    
        while(n!=0){
           if(n % 2 == 0){
            count++;
           }
           n = n/2;  
        }
        res = (int)(Math.pow(2,count));
       if(res == temp){
        System.out.println("True");
       }else{
        System.out.println("False");
       }
         System.out.println(res);
    }
}