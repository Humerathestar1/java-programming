
import java.util.*;
class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
   System.out.println("Enter a no : ");   
     int n = sc.nextInt();
     if(n<=1){
   System.out.println("The no is not prime");   
     }
     else{
         int i=2;
        while(i*i<=n){
            if(n%i==0){
              System.out.println(n + " is not a prime number.");
              return;
            }
            i++;
      
             
     }
        System.out.println(n + " is a prime number.");
           
            }
        }
    }
