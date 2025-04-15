public class SortedOrNot {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,1,6};
        boolean assending = true;         
        boolean desending = true;
        for(int i = 0 ; i< arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                assending = false;
            }
            if(arr[i]<arr[i+1]){
                desending = false;
            }
        }
        if(assending==true){
            System.out.println("array is sorted in assending order");
        }
        if(desending==true){
            System.out.println("Array is sorted in decending order");
        }
        if(assending==false && desending== false){
            System.out.println("not sorted");
        }
    }
}
 