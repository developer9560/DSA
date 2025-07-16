public class revisionSortedOrNot {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean isSorted = true;

        for(int i = 0 ;i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }else{
                isSorted = false;
                break;
            }  
        }
        if(isSorted){
            System.out.println("Array is sorted in ascending order");
            return;
        }else{
            System.out.println("Array is not sorted in ascending order");
        }

        // Check if the array is sorted in descending order
        isSorted = true;
        for(int i = 0 ;i<arr.length-1; i++){
            if(arr[i]>=arr[i+1]){
                continue;
            }else{
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted in descending order");
        }else{
            System.out.println("Array is not sorted in descending order");
        }
    }
}
