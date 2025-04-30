public class mergeSort {

    public static void merge(int arr, int st, int mid, int end){
        
    }
    static void MergeSort(int arr[],int st, int end){
        if(st>=end){
            return ;
        }
        int mid = st + (end-st)/2;
        MergeSort(arr, st, mid);
        MergeSort(arr, mid+1,end);


    }
    public static void main(String[] args){
        int arr[]={38, 2, 43, 2, 9, 82, 10};

 }
}
