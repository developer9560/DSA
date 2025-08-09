package Array;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the subArray less than "+arr.length);
        int k = sc.nextInt();
        if(k <= 0 || k > arr.length){
            System.out.println("Invalid subarray size.");
            return;
        }

        for(int i = 0; i<arr.length-k; i++){
            for(int j = i ; j<k+i; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        int [] ans = new int[arr.length];
        int sum = 0;
        System.out.println("\n find the maximum sum of subarray");
        for(int i = 0; i<arr.length-k; i++){
            for(int j = i ; j<k+i; j++){
                sum =  sum+ arr[j];

            }
            System.out.print(sum+" ");
            ans[i]=sum;
            sum= 0;
        }
        System.out.println();
        int max = 0;
        for(int a : ans){
            if(max<a){
                max= a;
            }
        }
        System.out.println(max);




    }

}
