public class MergeSort {
    public static void PrinctArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void merge(int arr[] ,int l , int mid , int r){
        int n1 = mid -l +1;
        int n2 = r-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i , j , k ;
        for(i = 0; i<n1;i++) left[i] = arr[l+i];
        for(j = 0 ;j<n2;j++)right[j] = arr[mid+1+j];

        i = 0; j= 0;k = l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        while(i<n1){ // this copy the remaining element in left array
            arr[k++]=left[i++];
        }

        while(j<n2){ // this copy the remaining element in right array
            arr[k++]= right[j++];
        }

    }
    // this function for sorting the array its mean devide the array untile array become the single element
    static void mergeSort(int arr[], int l, int r){
        if(l>=r)return;
        int mid = l + (r-l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);

        merge(arr, l, mid, r); // this funtion merge the two arrays 
    }

    public static void main(String[] args){
        int arr[]={38, 2, 43, 2, 9, 82, 10};
        int n = arr.length;
        System.out.println("Unsorted Array: ");
        PrinctArray(arr);
        mergeSort(arr, 0, n-1);
        System.out.println("After the sorted array");
        PrinctArray(arr);
    }
}
