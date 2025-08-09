package Array;

import java.util.Scanner;

public class rotateArraybyKSteps {
    static void reverse(int[] arr , int strIdx , int endIdx){
        while(strIdx<endIdx){
            int temp = arr[strIdx];
            arr[strIdx]=arr[endIdx];
            arr[endIdx]=temp;
            strIdx++;
            endIdx--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of K for rotating: ");
        int k = sc.nextInt();
        int n = arr.length;
        k= k%n;
        for(int i = n-k; i<n;i++){
            System.out.print(" "+arr[i]);
        }
        for(int i = 0 ; i<n-k; i++){
            System.out.print(" "+arr[i]);
        }

        System.out.println("\n rotate in place , without using extra space or another array");
        reverse(arr , 0 ,n-k-1);
        reverse(arr , n-k , n-1);
        reverse(arr, 0 , n-1);


        for(int a :arr){
            System.out.print(a+" ");
        }

    }
}
