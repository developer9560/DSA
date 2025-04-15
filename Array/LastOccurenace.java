import java.util.Scanner;

public class LastOccurenace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,4,2,4,23,5,2,6,2,7,3,8,4,8,4,5,5,5,6,3,7,2,54};
        System.out.println("Enter the number to find :");
        int key = sc.nextInt();
        int lastIndex = -1;
         for(int i = 0 ; i< arr.length; i++){
            if(arr[i] == key){
                lastIndex = i;
            }
        }
        System.out.println("Last index of "+ key +" is "+ lastIndex);

    }
}
