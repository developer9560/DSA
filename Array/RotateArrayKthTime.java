import java.util.Scanner;

public class RotateArrayKthTime {
   static void reverse(int arr[], int start, int end) {
       while(start<end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
   }
    static void printArray(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void RotateSelf(int arr[], int k) {
        k%=arr.length;
        reverse(arr, 0 , arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        printArray(arr);

    }
    static void NewArrayRotate(int arr[], int k) {
        k = k%arr.length;
        int ans[] = new int[arr.length];
        int j = 0;
        for(int i = arr.length-k ; i<arr.length; i++){
            ans[j] = arr[i];
            j++;
        }
        for(int i = 0 ;i< arr.length-k; i++){
            ans[j] = arr[i];
            j++;
        }
        printArray(arr);
        System.out.println("\nnewarray rotate");
        printArray(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the number of times to rotate array : ");
        int k = sc.nextInt();
        NewArrayRotate(arr,k);
        System.out.println("\nself rotate");
        RotateSelf(arr,k);
    }
}