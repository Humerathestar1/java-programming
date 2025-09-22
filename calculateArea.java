import java.util.*;

 class area  {

    public double circle(int r) {
        return 3.14*r*r;
    }

    public int rectangle(int l, int w) {
        return l*w;
    }

    public double triangle(int l, int w) {
        return 0.5*l*w;
    }

   
    public static void main(String[] args) {
        int x, y,r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        r = sc.nextInt();

        System.out.print("Enter the length: ");
        x = sc.nextInt();
        
        System.out.print("Enter the width: ");
        y = sc.nextInt();
        

        area calc = new area();

        System.out.println("Area of Circle = " + calc.circle(r));
        System.out.println("Area of rectangle = " + calc.rectangle(x, y));
        System.out.println("Area of triangle = " + calc.triangle(x, y));
        
    }
}
