import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int button= sc.nextInt();

        switch(button){
            case 1: System.out.print("hello");
            break;
            case 2: System.out.print("Namaste");
            break;
            case 3: System.out.print("Bonjor");
            break;
            case 4:System.out.print("Assalamualikum");
            break;
            default:System.out.print("Invalid Button");
        }
    } 
}
