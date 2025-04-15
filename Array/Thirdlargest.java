public class Thirdlargest {
    public static void main(String[] args) {
       int nums[] = {3,2,1};
       int largest = nums[0];   
       int secondLargest = nums[0];
       int thirdLargest = nums[0];
       for(int i = 0; i<nums.length; i++){
           if(nums[i] > largest){
               thirdLargest = secondLargest;
               secondLargest = largest;
               largest = nums[i];
           }
           else if(nums[i] > secondLargest && nums[i] < largest){
               thirdLargest = secondLargest;
               secondLargest = nums[i];
           }
           else if(nums[i] > thirdLargest && nums[i] < secondLargest){
               thirdLargest = nums[i];
           }
       }
       System.out.println("Third largest number is "+ thirdLargest);
    }
}
