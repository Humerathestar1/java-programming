import java.util.*;

class Main {
    public static void Add(int a, int b) {
        int sum = a + b;
        System.out.println("the sum of two no is:"+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Add(a, b); 
    }
}
