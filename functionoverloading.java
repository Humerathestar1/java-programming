import java.util.*;

class Calculate {

    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int subtract(int a, int b) {  
        return a - b;
    }
    public int subtract(int a, int b, int c) {  
        return a - b - c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st no: ");
        int x = sc.nextInt();
        
        System.out.print("Enter the 2nd no: ");
        int y = sc.nextInt();
        
        System.out.print("Enter the 3rd no: ");
        int z = sc.nextInt();  

        Calculate calc = new Calculate();

        System.out.println("Addition of first two numbers = " + calc.add(x, y));
        System.out.println("Subtraction of first two numbers = " + calc.subtract(x, y));

        System.out.println("Addition of all three numbers = " + calc.add(x, y, z));
        System.out.println("Subtraction of all three numbers = " + calc.subtract(x, y, z));
    }
}
