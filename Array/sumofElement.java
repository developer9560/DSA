public class sumofElement {

    public static void main(String[] args) {
        int arr[]= {32,54,55,423,23,223};
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("total sum of array is :" +sum);
    }
    
}
