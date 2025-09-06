import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if(age>18){
            System.out.print("you can vote");
        }
         else{
             System.out.print("you are not applicable for vote");
         }
            }
}
