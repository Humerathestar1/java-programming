import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of elements : "); 
        int n = sc.nextInt();
        
        int arr[]= new int [n];
     
        int sumodd=0;
        int sumeven=0;
       System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
            sumeven+=arr[i];
            }
            else{
                 sumodd+=arr[i];
            } 
        }
       System.out.println("Even numbers: " + sumeven);
        System.out.println("Odd numbers: " + sumodd); 

        
    
    }
}
