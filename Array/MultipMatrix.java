import java.util.Scanner;

public class MultipMatrix {
    static Scanner sc = new Scanner(System.in);
    static void InputArray(int r , int c , int arr[][]){
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9},
                        {1,2,3},{4,5,6},{7,8,9},
                        {1,2,3},{4,5,6},{7,8,9}};
                        
        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9},
                        {1,2,3},{4,5,6},{7,8,9},
                        {1,2,3},{4,5,6},{7,8,9}};
        
        int sum = 0;
        int multi[][] = new int[3][3];
        for(int i =0; i<3;i++){
            for(int j = 0; j<3; j++){
                   
            }
        }
    }
}