public class removeDublicate {

    public static void main(String[] args){
        int arr[]={1,1,2,2,2,3,3,4,4,5,5};
        int n = arr.length;
        int j = 1;
        for(int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
            for(int k=0; k<n; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        System.out.println("final array after removing duplicates: ");
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
        
    }
    
}
