package Array;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int windowSum = 0;
        int k = 3;
        for(int i = 0 ; i<k ;i++){
            windowSum += arr[i];
        }
        int max = windowSum;
        for( int i = k ; i<arr.length ;i++){
            windowSum += arr[i] - arr[i-k];
            if(windowSum>=max){
                max=windowSum;
            }
        }
        System.out.println(max);
    }
}
