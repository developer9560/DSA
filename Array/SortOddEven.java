// given an array of intergers 'a ' move all th even intergers at the befinnign of the array folowd by all the odd integrs. The raltieorfero of odd or eveninterges does not atter. Return any array tha satisfies the condition.

public class SortOddEven {
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6,7,8,90,21,34,56,78,5,47,6932,54,67,12,23,34,45,67};
        int i = 0; 
        int j = arr.length-1;
        System.out.println(arr[i]%2);
        while(i<j){
            if( arr[i]%2 != 0 && arr[j]%2==0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2!=0){
                j--;
            }
        }
        for(int k = 0; k<arr.length; k++)
        {
            System.out.print(arr[k] + " ");
        }
    }
    
}
