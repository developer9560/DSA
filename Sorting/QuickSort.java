// QuickSort.java
public class QuickSort {

    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;
        for(int i= st+1;i<=end;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = st+count;
        swap(arr, pivotIndex, st);
        int i = st;
        int j = end;

        while(i<pivotIndex&&j>pivotIndex){
            while(arr[i]<pivot){i++;}
            while(arr[j]>pivot){j--;}

            if(i<pivotIndex&&j>pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }

        }
        return pivotIndex;
    }

    public static  void quickSort(int[ ]arr, int st, int end){
        if(st>=end){
            return;
        }
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);


    }
    public static void main(String[] args) {
        int arr[] ={ 2,6,3,9,4,5,0,6,2};
        System.out.println("Array Before QuickSort");
        PrintArray(arr);
        quickSort(arr, 0, arr.length-1);
        System.out.println("Array After QuickSort");
        PrintArray(arr);


    }
}
