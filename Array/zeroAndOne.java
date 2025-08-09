package Array;

public class zeroAndOne {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,0,1,1,1,0,1,0,1};
        int i = 0; int j = arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }

        }
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
