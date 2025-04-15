public class linearSearch {
    static void search(int arr[] , int key , int idx){
        if(idx == arr.length-1){
            System.out.println("not found");
            return;
        }
        if(arr[idx] == key){
            System.out.println("found at index "+ idx);
            return;
        }
        search(arr , key , idx+1);  

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,4,7,54,745,43,23,325,56,76};
        search(arr, 6, 0);
    }
    
}
