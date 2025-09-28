import java.util.*;
class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row");
    
        int rows = sc.nextInt();
      System.out.println("Enter the size of the column");

        int cols = sc.nextInt();
        int number [][] = new int [rows][cols];
        
       System.out.println("Enter the row & column : ");  
        for(int i = 0 ; i < rows ; i++){
            for(int j=0;j<cols;j++){
                number[i][j] = sc.nextInt();
            }
        }
         System.out.println("Enter the element you want to search : ");   
       int x = sc.nextInt();
        for(int i = 0 ; i < rows ; i++){
            for(int j=0;j<cols;j++){
             if(number[i][j] == x){
             System.out.println("the no is found at index : ("+ i+", "+j+") ");  
   
             }
            }
        }
        
    }
}
