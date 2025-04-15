public class ReverseArray {
    public static void main( String[] args ) {
        int arr[] = { 1,2,3,4,5,6,7,8,9};
        int temp = arr[0];
        int j = arr.length-1;
        for(int i = 0 ; i<arr.length; i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
