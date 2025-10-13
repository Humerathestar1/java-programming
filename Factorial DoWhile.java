import java.util.*;
class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
   System.out.println("Enter a no : ");   
     int n = sc.nextInt();
        int i=1;
          int fact=1;
        do{
            fact*=i;
            i++;
          
        }while(i<=n);
         System.out.println(fact+ "  factorial of a no"); 
        }
    }

