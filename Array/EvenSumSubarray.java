public class EvenSumSubarray {
    static void countPartitions(int[] nums) {
        int count = 0;
        int firstSum = 0; 
        int secondSum = 0;
        for(int i = 0;i<nums.length; i++){
            for(int j = 0; j<=i; j++){
                firstSum+= nums[j];
                // System.out.print("value of j "+j);
                // System.out.println();
                // System.out.print("value of sum "+firstSum);

            }
            System.out.println();
            for(int k = i+1; k<nums.length; k++){
                secondSum+=nums[k];
                // System.out.print("value of k " +k);
                // System.out.println();
                // System.out.print("value of second sum "+secondSum);
            }
            if(firstSum%2==0 && secondSum%2==0){
                count++;
            }
            firstSum = 0;
            secondSum = 0;

        }
        System.out.println(count); 
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8};
        countPartitions(arr);}
    
}
