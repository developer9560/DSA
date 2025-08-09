public class TargetSum {
    public static void main(String[] args){
        int [] arr = {3, 5, 1, 8, 2, 7};
        int target = 10;
        boolean found = false;
        for(int i = 0 ; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(target==arr[i]+arr[j]){
                    System.out.println("sum found with elements "+ arr[i] +" "+ arr[j]);
                }
            }
        }
        

    }
}
