import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        if(a==b){
            System.out.print("A and B are equal");
        }
        else if(a>b){
              System.out.print("A is greater than B");

        }
         else{
             System.out.print("B is Greater Than A");
         }
            }
}
