public class SuffixSum{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,1};
        int sum = 0;
        int ans[] = new int[arr.length];
        for(int i = 0 ; i<arr.length; i++){
            for(int j = i ; j<arr.length; j++){
                sum += arr[j];
            }
            ans[i] = sum;
            sum = 0;
        }
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(ans[i] + " ");
        }
        // anthor way of suffix sum array in ans1 array it mean another way 

       int ans1[] = new int[arr.length];
       ans1[arr.length-1] = arr[arr.length-1];

       for(int i = arr.length-2; i>=0; i--){
            ans1[i] = arr[i] + ans1[i+1];
            
       }
       System.out.println("\n");
       for(int i = 0 ; i<arr.length; i++){
            System.out.print(ans1[i] + " ");
        }

        // change arr array it self as suffix sum;
        for(int i = arr.length-2; i>=0; i--){
            arr[i] = arr[i] + arr[i+1];
        }
        System.out.println("\n");
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
 



    }
}