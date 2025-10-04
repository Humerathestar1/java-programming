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
  System.out.println(0.5*l*h); 
}
}
class Main {
    
    public static void main(String[] args) {
       EquilateralTriangle obj = new EquilateralTriangle();
       
       obj.Area(10,5);
       
    }
}
