// delete dublicate number from array

public class deleteElement {
    public static void main(String[] args){
        // initial array;
        // cheack dublicate;
        int arr[] = {2,4,1,42,5,6,6,7,4,7,34,23};
        for(int i = 0 ; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++ ){
                if(arr[i]==arr[j]){
                    for(int k = j ; k<arr.length-1; k++){
                        arr[k] = arr[k+1];
                    }
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
