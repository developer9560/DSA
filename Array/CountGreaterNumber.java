import java.util.Scanner;

public class CountGreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 32, 32, 423, 23, 42, 32, 353, 25, 3, 2, 53, 23, 2, 42532, 5234, 45, 3434, 63432, 53 };
        int count = 0;
        System.out.println("Enter the number to find :");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > key) {
                count++;
            }

        }
        System.out.println("Count of number greater than " + key + " is " + count);

    }
}
