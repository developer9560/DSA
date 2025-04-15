import java.util.Scanner;

public class Rotate90degMatrix {
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
    public static void main(String[] args){
        int r = 3; int c = 3;
        int matrix[][] = new int[r][c];
        InputArray(r, c, matrix);
        PrintMatrix(r, c, matrix);
        // first of all find transpose of matrix and reverse each row;
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        System.out.println("Transpose of matrix");
        PrintMatrix(r, c, matrix);
        int start = 0;
        int end = c-1;

        for (int i = 0; i < r; i++) {
            while(start<end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end]= temp;
                start++; end--;
            }  
        }
        System.out.println("rotated matrix that means reverse of transpose");
        PrintMatrix(r, c, matrix);
    }
}
