

public class BinarySearch {

    public static int binarySearch(int arr[], int key){
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){  
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        System.out.println("Original array: ");
        PrintArrays p = new PrintArrays();
        p.PrintArray(arr);
        int key = 10;
        int index = binarySearch(arr, key);
        if(index == -1){
            System.out.println("Element not found in the array.");
        }else{
            System.out.println("Element found at index: " + index);
        }
        
    }
}
