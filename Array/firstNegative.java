package Array;
// first negative number in every window of size k
public class firstNegative {
    public static void main(String[] args) {
        int[] arr = {1,-1,2 ,6,4,5,-2,3,-4,5,-2};
        int k = 3;
        //by brute force approach
        for(int i = 0 ; i<arr.length-k;i++){
            for(int j = i; j<k+i; j++){
                if(arr[j]<0) {
                    System.out.println(arr[j] + " at index " + j);
                    break;
                }
            }
        }
    }
}
