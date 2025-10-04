class Student{
    String name;
    int age;
    
    public void PrintInfo(String name){
        System.out.print(name);
    }
 public void PrintInfo(int age){
        System.out.print(age);
    } 
  public void PrintInfo(String name,int age){
        System.out.print(name+ " "+age);
    }   
}
class Main {
    
    public static void main(String[] args) {
       Student obj = new Student();
       obj.name = "Humaira";
       obj.age = 19;
       obj.PrintInfo(obj.name,obj.age);
    }
}
