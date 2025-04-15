import java.util.Arrays;

public class BubbleSort {

    static void Bubblesort(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void PrintArr(int arr[], int idx){
        if(idx==arr.length-1){
            return;
        }
        System.out.print(arr[idx]+" ");
        PrintArr(arr, idx+1);
    }
    static void BubbleSortOtimized(int arr[]){
        for(int i = 0; i<arr.length;i++){
            boolean flag = false;
            for(int j= 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {32,43,23,22,43,46,65,77,323,47,8754,3,2312,454};
        System.out.println("Original array: ");
        PrintArr(arr, 0);
        // Bubblesort(arr);
        Arrays.sort(arr);
        System.err.println("\nafter sorting the array: ");
        PrintArr(arr, 0);
    }
}
