public class largest {
    public static void print(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,67,67,98,89,65,456};
        int max =0 ;
       
        System.out.println("original array ");
        print(arr);
        
        for(int i = 0; i< arr.length-1; i++ ){
            if( arr[i] >  arr[i+1]){
                max = arr[i];
               

                
            }
            else {
                max = arr[i+1];
               
            }
        
        }
        System.out.println("largest is "+ max);
       
    }
}
