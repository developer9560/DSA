public class Sumofallsubarray {
    
        static int subarraySum(int[] nums) {
            int sum = 0;
            int total = 0;
            for(int i = 0; i<nums.length;){
                for(int j = 0 ; j<=i; j++){
                    sum+=nums[j];
                }
                total+=sum;
                sum=0;
            }
            return total;
        }
    public static void main(String[] args) {
        int nums[] ={3,2,1};
        System.out.println("hello");
        int sum = 0;
        int total = 0;
        for(int i = 1; i<nums.length;){
            for(int j = 0 ; j<=i; j++){
                sum+=nums[j];
            }
            total+=sum;
            sum=0;
        }
        System.out.println(total);
        
    }
   
    
}
