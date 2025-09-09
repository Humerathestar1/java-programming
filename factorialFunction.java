import java.util.*;

class Main {
    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) { 
            fact = fact * i;
        }
        System.out.println("The Factorial of given number is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        factorial(n); 
    }
}
