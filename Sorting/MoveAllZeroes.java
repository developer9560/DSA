
public class MoveAllZeroes {

    static void BubbleSortConcept(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]==0&& arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,2,0,4,6,0,0,3,5}; 
        BubbleSortConcept(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
} 
