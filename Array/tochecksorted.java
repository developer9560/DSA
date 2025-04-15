public class tochecksorted {
    
   
        public static void print(int arr[]) {
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
        public static void main(String[] args) {
            int arr[]={1,2,4,5,694,70,89,300,456};
            int sort = 2;
            System.out.println("original array ");
            print(arr);
            for(int i = 0; i< arr.length-1; i++ ){
                if( arr[i] <  arr[i+1]){ 
                    sort = 1 ;    
                }
                else {
                    sort = 0;
                    break;
                }
            
            }
            if( sort == 0){
                System.out.println("  not sorted");
            }else if(sort==1){
                System.out.println(" sorted");
            }
        }
    
    
}
