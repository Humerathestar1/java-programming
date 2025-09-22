import java.util.*;

 class calculator  {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Can't divide by zero");
            return 0; // safe return
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Can't take modulo by zero");
            return 0;
        }
        return a % b;
    }

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        x = sc.nextInt();

        System.out.print("Enter second number: ");
        y = sc.nextInt();

        calculator calc = new calculator();

        System.out.println("Addition = " + calc.add(x, y));
        System.out.println("Subtraction = " + calc.sub(x, y));
        System.out.println("Multiplication = " + calc.multi(x, y));
        System.out.println("Division = " + calc.div(x, y));
        System.out.println("Modulo = " + calc.modulo(x, y));

        sc.close();
    }
}
