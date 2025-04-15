import java.util.Arrays;
public class SmallestLargest {
    public static void main(String[] args) {
        int arr[] = {2,42,42,32,343,5,-3,634,434,63,634,42,43,534,564,64,2};
        int smallest = arr[0];
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
            if(arr[i] > largest){
                largest = arr[i];
            }  
        }

        System.out.println("Smallest number is "+ smallest +" and largest number is "+ largest);
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
    
}
