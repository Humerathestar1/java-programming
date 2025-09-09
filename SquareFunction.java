import java.util.*;

public class Main {
    public static void Square(int num) {
        int sq = num * num;
        System.out.println("The square is: " + sq);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Square(num);
    }
}
