public class secondLargestTest {

    public static void main(String[] args) {
        
        int[] arr = {8,9,11,1,2};

        int max = arr[0];
        int smax = max;
        Integer x = null;
        // int y = null;

        for(int i = 1; i< arr.length; i++){
            if(max < arr[i]){
                smax = max;
                max = arr[i];
            }
        }
        System.out.println("max largest is " + max);
        System.out.println("second largest is " + smax);

    }
    
}
