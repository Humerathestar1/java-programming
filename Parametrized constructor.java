class Student{
    String name;
    int age; 
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
    this.name = name;
    this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Student obj = new Student("Humaira" ,24);
        
        obj.print();
    }
}
