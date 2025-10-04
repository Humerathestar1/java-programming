class Shape{
    
    public void Area(){
        System.out.print("Display area");
    }
}
class Triangle extends Shape{
   public void Area(int l,int h){
  System.out.println(0.5*l*h);
  System.out.print("Area of triangle");
}
}
class EquilateralTriangle extends Triangle{
   public void Area(int l,int h){
  System.out.println("The area of EquilateralTriangle is : "+ 0.5*l*h); 
}
}
class circle extends EquilateralTriangle {
     public void Area(int r){
  System.out.println("The area of circle is : " +(3.14)*r*r); 
     }
}
class Main {
    
    public static void main(String[] args) {
       circle obj = new circle();
       obj.Area(7,8);
       obj.Area(10);
       
    }
}
