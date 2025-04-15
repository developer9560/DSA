import java.util.Scanner;

public class array2d {
    


    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number row ");

        int n = sc.nextInt();
        System.out.println("Enter the number colomn ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.println("Enter the ["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // int arr[][] = { { 1, 2, 3,32 }, { 4, 5, 6 ,32}, { 7, 8, 9 ,54} ,{ 7, 8, 9 ,54} };
        // System.out.println(arr.length);
    }
}
