import java.util.Scanner;

public class multiarray {
    static Scanner sc = new Scanner(System.in);
    static void InputArray(int r , int c,int arr[][]){
        for(int i = 0; i<r ; i++){
            for(int j = 0; j<c; j++){
                System.out.println("enter "+ i+j);
                arr[i][j]= sc.nextInt();
            }
        }
    }
    static void PrintMatrix(int r , int c, int arr[][]){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int c1 = 4;
        int r1 = 2;
        int r2 = 4;
        int c2 = 3;
        if(c1!=r2) {
            System.out.println("multiply not possible");
            return ;
        }
        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];
        int ans[][] = new int[r1][c2];
        System.out.println("Enter the number of matrix 1 : ");
        InputArray(r1, c1, arr1);
        System.out.println("Enter the number of matrix 2: ");
        InputArray(r2, c2, arr2);
        System.out.println("matrix first is: ");
        PrintMatrix(r1, c1, arr1);
        System.err.println("Matrix second is: ");
        PrintMatrix(r2, c2, arr2);
        // logic for multiply ;
       for (int i = 0; i < r1; i++) {// row number
            for (int j = 0; j < c2; j++) { // coloumn number
                for(int k = 0; k<c1; k++){
                    ans[i][j]+= (arr1[i][k]*arr2[k][j]);
                }
            }         
       }
       System.out.println("multiply answer");
       PrintMatrix(r1, c2, ans);
   }
}