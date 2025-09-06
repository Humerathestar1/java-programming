import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int Days= sc.nextInt();

        switch(Days){
            case 1: System.out.print("Sunday");
            break;
            case 2: System.out.print("Monday");
            break;
            case 3: System.out.print("Tuesday");
            break;
            case 4:System.out.print("Wednesday");
            break;
            case 5:System.out.print("Thursday");
            break;
            case 6:System.out.print("Friday");
            break;
            case 7:System.out.print("Saturday");
            break;
            default:System.out.print("Invalid day");
        }
    } 
}
