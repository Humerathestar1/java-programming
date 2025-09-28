import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array : "); 
        int size = sc.nextInt();
       
        int number[]= new int [size];
      System.out.println("Enter the element of array : ");
        for(int i = 0; i<size;i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search : ");
         int x = sc.nextInt();
        
        //output
       for(int i=0 ;i<number.length;i++){
           if(number[i]==x){
          System.out.println("x is found at index : "+ i);
  
           }
       }
    
    }
}
