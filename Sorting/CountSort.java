public class CountSort {
    static int max(int arr[]){
        int max = arr[0];
        for(int i= 1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void BasicCountSort(int arr[]){
        int max = max(arr);
        int count[]=new int[max+1];
        for(int i = 0; i<arr.length;i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i = 0; i<count.length;i++){
            for(int j = 0; j<count[i];j++){
                arr[k++] = i;
            }
        }
       
    }
    
    public static void main(String[] args) {
        int arr[] = {4,2,2,8,3,3,1};
        PrintArrays p = new PrintArrays();
        System.out.println("Original array: ");
        p.PrintArray(arr);
        BasicCountSort(arr);
        System.out.println("After sorting the array: ");
        p.PrintArray(arr);
        
    }
    
}
