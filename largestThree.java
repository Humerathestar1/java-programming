import java.util.*;

public class LargestNestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Largest: " + a);
            } else {
                System.out.println("Largest: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Largest: " + b);
            } else {
                System.out.println("Largest: " + c);
            }
        }
    }
}
