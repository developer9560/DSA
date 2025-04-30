

public class binarySearchRecursive {
    public static int binarySearch(int arr[], int st, int end , int key){
        if(st>=end){
            return -1;
        }
        int mid = st + (end-st)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]<key){
            return binarySearch(arr, mid+1, end, key);

        }else{
            return binarySearch(arr, st, mid-1, key);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        System.out.println("Original array: ");
        PrintArrays p = new PrintArrays();
        p.PrintArray(arr);
        int key = 10;
        int index = binarySearch(arr, 0, arr.length-1, key);
        if(index == -1){
            System.out.println("Element not found in the array.");
        }else{
            System.out.println("Element found at index: " + index);
        }
        
    }
}