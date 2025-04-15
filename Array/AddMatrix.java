import java.util.Scanner;

public class AddMatrix {
    
    static Scanner sc = new Scanner(System.in);

    static void InputArray(int r , int c,int arr[][]){
        for(int i = 0; i<c ; i++){
            for(int j = 0; j<r; j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);
        int r1, c1;
        System.out.println("Enter the first Matrix");
        System.out.print("\nEnter number of row : ");
        r1 = ab.nextInt();
        System.out.println("Enter the number of coloumn: ");
        c1 = ab.nextInt();
        int arr[][] = new int[c1][r1];
        InputArray(r1, c1, arr);
        System.out.println("Enter the second matrix");
        int arr2[][] = new int [c1][r1];
        InputArray(r1, c1, arr2);
        int add[][] = new int[c1][r1]; 
        for(int i = 0; i<c1 ; i++){
            for(int j = 0 ;j<r1; j++){
                add[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of both matrix is : ");
        for(int i = 0; i<c1 ; i++){
            for(int j = 0 ;j <r1; j++){
                System.out.print(add[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
