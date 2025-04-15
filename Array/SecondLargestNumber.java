public class SecondLargestNumber {
    
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,1,7,2,8,9,34,63};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if( arr[i]>secondLargest && arr[i]< largest ){
                secondLargest = arr[i];
            }
        }

        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] > largest){
        //         secondLargest = largest;
        //         largest = arr[i];
        //     }
        //     else if(arr[i] > secondLargest && arr[i] < largest){
        //         secondLargest = arr[i];
        //     }
        // }
        System.out.println("Second largest number is "+ secondLargest);
    }
}
