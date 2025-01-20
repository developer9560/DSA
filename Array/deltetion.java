import java.util.*;

public class deltetion {
  
    public static void print(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,7,2,5,3,9,0,4,6,8};
          System.out.println("origina array ");
        print(arr);

      
        System.out.println(" enter the number to delete");
        int num = sc.nextInt();
        for(int i = 0 ; i< arr.length-1; i++){
            if(arr[i]==num){
                
                for( int j = i ; j< arr.length-1; j++){
                    arr[j]= arr[j+1];
         
                }
               
                break;
            }
        }
        
        print(arr);
    }
    
}


