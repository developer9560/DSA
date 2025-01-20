

class binarysearch {
        public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int key = 7;
        
        while (low<=high) {
            int mid = low + (high - low)/2;
            if(arr[low]== key){
                System.out.println("the element found at index : "+ low);
                break;
            }else if(arr[high]==key){
                System.out.println("the element found at index : "+ high);
                break;
            }else if (arr[mid]==key) {
                System.out.println("the element found at index : "+ mid);
                break;
            }
            if( arr[mid]>key){
                low = mid+1;
            }else{
                high= mid-1;

            }

        }

    
        
    }
}