import java.util.Scanner;

public class TransposeMatrix {
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
        int r = 3;
        int c = 3;
        int arr[][] = new int[r][c];
        int ans[][] = new int[c][r];
        InputArray(r, c, arr);
        PrintMatrix(r, c, arr);
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of matrix ");
        PrintMatrix(c, r, ans);
// transpose in place ;
if(r!=c) return;
        System.out.println("transpose in place ");
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;                
            }
            
        }  
        PrintMatrix(r,c, arr);
    }
    
}
