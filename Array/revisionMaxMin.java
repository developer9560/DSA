public class revisionMaxMin {

    static int[] findMaxMin(int[] arr){ 
        int max = arr[0];
        int min = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        
        return new int[]{max, min};
    }

    public static void main(String[] args){
        int[] arr = {3, 5, 1, 8, 2, 7};
        
        int[] result = findMaxMin(arr);
        
        System.out.println("Maximum value: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
    }

}
