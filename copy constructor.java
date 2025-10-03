class Student{
    String name;
    int age; 
     Student(){
        
       }  
    Student(Student obj1){
   this.name = obj1.name;
   this.age = obj1.age;
    }
     public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "humaira";
        obj.age = 19;
      Student obj1 = new Student(obj);
      obj1.print();

      
    }
}
