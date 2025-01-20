public class reverse {
    public static void print(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9};
        int temp = arr[0];
        System.out.println("original array ");
        print(arr);
        for( int i = 0 ; i< arr.length-1; i++){
            arr[i] = arr[arr.length-1-i];
          
        }
        arr[arr.length-1] = temp;
        System.out.println("\nreversed array");
        print(arr);
    }
    
}
