class Student{
    String name;
    int age; 
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}

class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Humaira";
        obj.age = 19;
        obj.print();
    }
}
