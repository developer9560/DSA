// array refference in java

import java.util.Scanner;
import java.util.Arrays;

public class CloningArray {
    static void  princtArray(int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        princtArray(arr);
        System.out.println();
        // int arr2[] = arr;  // by this way we can change the original array it make a shallow copy of array
        //  int arr2[] = arr.clone(); // by this way we can't change the original array it make a deep copy of array
        // int arr2[]= Arrays.copyOf(arr , arr.length);// by this method we can copy the array and we can set length of array to copy
        int arr2[] = Arrays.copyOfRange(arr, 0, arr.length-2); // by this method we can copy the array and we can set range of array to copy and can be set range of aaray to where to copy  , start index and end index
        // now changing in arr2 will also change in arr

        arr2[0] = 100;
        arr2[1] = 200;
        System.out.println("\nafter change in arr2");
        princtArray(arr);
        System.out.println();
        princtArray(arr2);
    }
}