// given Q queries, check is the given number is present in the array or not
// Note: value of all th element in the array is less than 10 to power 5;

import java.util.Scanner;

public class FreQueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {3,5,32,54,2,67,45,3,1,32,34,54,56,7,87,909,67,534,23,2,3,4,5,6,7,7,89,9,0,5,4,3,2,1,2,22,3,11223,23,4,45};
        int n = arr.length;
        int q = 10;
        int frequncyArry[] = new int[100000+1];
        for(int i = 0; i<n; i++){
            frequncyArry[arr[i]]++;
        }
          while(q>0){
            System.out.println("\nEnter the number : ");
            int num = sc.nextInt();
           if(frequncyArry[num]>0){
               System.out.println("yes");
           }else{
            System.out.println("no");
           }
            q--;
        }

    }
}
