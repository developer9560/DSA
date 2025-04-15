import java.util.Scanner;

public class CountElementInArray {
 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int newArr[] = new int[10];
        int j = 0;

        int arr[] = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        System.out.println("Enter the number to count : ");
        int key = sc.nextInt();

        for(int i = 0; i<arr.length; i++){
            if(key== arr[i]){
                count++;
                newArr[j]= i;
                j++;
            }
        }
        if(count == 0){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found "+ count +" times" + "\n element found at index");
        
            for(int i = 0 ; i<j; i++){
                System.out.print( newArr[i]+ " ");
            }
        }

    }
}

