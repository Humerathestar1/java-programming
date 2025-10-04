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
class Main {
    
    public static void main(String[] args) {
       Triangle obj = new Triangle();
       
       obj.Area(10,5);
       
    }
}
