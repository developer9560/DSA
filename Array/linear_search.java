/**
 * linear_search
 */
import java.util.Scanner;

public class linear_search {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 0;
    
        int arr[]={34,534,646,757,856,844,8453,845,455,65,454};
        for(int i=0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter number for search in array");
                int key = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println(" number found at index : "+ i );
                n++;
                break;
            }
        }
        if(n==0){
            System.out.println("not found");
        }
        

        
      }
    
}