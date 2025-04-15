public class PasclaTriangle {
    static void PrintMatrix(int r , int c, int arr[][]){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int matrix[][] = new int[n][];
        for(int i = 0; i< n ; i++){
            matrix[i] = new int[ i+1];
            matrix[i][0] = matrix[i][i] = 1;
            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i-1][j]+ matrix[i-1][j-1];
                
            } 
        }
        for(int i = 0 ; i<n; i++){
            for(int j= 0 ; j<=i; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
