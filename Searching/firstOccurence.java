

public class firstOccurence{
    public static int firstOccurenc(int arr[], int key){
        int st = 0;
        int end = arr.length-1;
        int firsIndex = -1;
        while(st<=end){
            int mid = st+ (end-st)/2;
            if(arr[mid] == key){
                firsIndex = mid;
                end = mid - 1;
            } else if(arr[mid]>key){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return firsIndex;
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10,10,12};
        System.out.println("Original array: ");
        PrintArrays p = new PrintArrays();
        p.PrintArray(arr);
        int key = 10;
        int index = firstOccurenc(arr, key);
        if(index == -1){
            System.out.println("Element not found in the array.");
        }else{
            System.out.println("Element found at index: " + index);
        }
    }
}
