import java.util.Scanner;

public class RangePrefixSum {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queries : ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter the starting index : ");
            int start = sc.nextInt();
            System.out.println("Enter the ending index : ");
            int end = sc.nextInt();
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += arr[i];
            }
            q--;
            System.out.println("Sum of range " + start + " to " + end + " is " + sum);
        }

    }
}
