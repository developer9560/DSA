public class prefixSum {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        
        for(int i = 1; i<arr.length; i++){
            prefixSum[i]= prefixSum[i-1] + arr[i];
        }
        System.out.println("prefix sum array : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(prefixSum[i] + " ");
        }
        // below code is for original array
        System.out.println();
        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        System.out.println("\noriginal array : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}