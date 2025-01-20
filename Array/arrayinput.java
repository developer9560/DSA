import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        int []arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<arr.length; i++){
            System.out.println("Enter the number of at index " + i);
            arr[i]= sc.nextInt();
        }
        System.out.println("Your array is :");
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
    
}
