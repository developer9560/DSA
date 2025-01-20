
public class sort_selection {
    
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
           
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = { 4,6,3,7,2,8,1,9};
        System.out.println("unsorted array");
        printarr(arr);
        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=(i+1); j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("\n sorted array");
        printarr(arr);
    }
    
}
