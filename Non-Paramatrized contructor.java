class Student{
    String name;
    int age; 
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
    System.out.print("constructor called")
    }
}

class Main {
    public static void main(String[] args) {
        Student obj = new Student(String name,int age);
        obj.name = "humaira";
        obj.age = 19;
        
        obj.print();
    }
}
