
public class LinearSearch {
    public static int linearSearch(int arr[],  int key){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void PrintArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
       
        System.out.println("Original array: "); 
        PrintArray(arr);
       
        int key = 10;
        int index = linearSearch(arr, key);
        if(index == -1){
            System.out.println("Element not found in the array.");
        }else{
            System.out.println("Element found at index: " + index);
        }
    }
}
