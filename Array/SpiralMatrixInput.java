import java.util.Scanner;

public class SpiralMatrixInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix number :");
        int n = sc.nextInt();
        int matrix[][]= new int[n][n];
        int totalElement = 1;
        int top = 0, right=n-1,   buttom = n-1, left= 0;
        while(totalElement<=n*n){
            // top -> left to right 
            for(int j = top; j<=right; j++){
                matrix[top][j] = totalElement;
                totalElement++;
            }
            // right -> top to buttom;
            top++;
            for(int i = top; i<=buttom; i++){
                matrix[i][right]= totalElement;
                totalElement++;
            }
            // buttom -> right to left
            right--;
            for(int j = right; j>=left; j--){
                matrix[buttom][j] = totalElement;
                totalElement++;

            }
            // left -> buttom to top;
            buttom--;
            for(int i = buttom; i>=top; i--){
                matrix[i][left]= totalElement;
                totalElement++;
            }
            left++;

            
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
