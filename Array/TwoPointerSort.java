public class TwoPointerSort {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,0,1,1,1,1,0,0,0,1,0,1,0,1,1,0,0};
        int n = arr.length;
        int j = arr.length-1;
        int i = 0;
       while(i<j){
           if(arr[i]== 1 && arr[j]==0 ){
               int temp = arr[i];
               arr[i]= arr[j];
               arr[j]= temp;
               i++;
               j--;
           }
        if(arr[i]==0){
            i++;
        }
        if(arr[j]==1){
            j--;
        }
       }
       for(int k = 0 ; k<n; k++){
        System.out.print(" "+ arr[k]);

       }
    }
}
