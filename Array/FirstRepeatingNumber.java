public class FirstRepeatingNumber {
    static int repeating( int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j]){
                    System.out.println("the first repeating number is : " +arr[i]);
                    return  0;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,3,1,5,9,2,6,9,4,0,2,5,3,6,7};
        if(repeating(arr)==-1){
            System.out.println("there is no repeating number");
        }
        
    }

    
}
