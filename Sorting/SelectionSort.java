

public class SelectionSort {
    static void SelectionSortt(int arr[]){
        for(int i= 0; i<arr.length;i++){
            int minIdx = i;
            for(int j=(i+1);j<arr.length-1;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx= j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx]= temp;
        }
    }
    static void PrintArr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={4,35,2,7,3,8,1};
        System.out.println("Original aray");
        PrintArr(arr);
        SelectionSortt(arr);
        System.out.println("\nsorted array");
        PrintArr(arr);
        
    }
}
