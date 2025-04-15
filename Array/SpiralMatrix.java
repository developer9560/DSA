public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        short r = 3 ; short c = 3;
        for(int i = 0 ; i<r; i++){
            for(int j = 0 ; j<c ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int toprow = 0, buttomrow =r-1 , leftCol= 0, rightCol= c-1;
        int totalElement = 0;
        System.out.println("Spiral order:");
        while (totalElement<r*c) {
            //top -> leftcol to rightcol;
            for(int j = leftCol;j<=rightCol && totalElement<r*c;j++ ){
                System.out.print(arr[toprow][j]+" ");
                totalElement++;
            }
            // right-> top to buttom ;
            toprow++;
            for(int i = toprow; i<=buttomrow && totalElement<r*c; i++){
                System.out.print(arr[i][rightCol]+" ");
                totalElement++;
            }
            // buttom -> right to left;
            rightCol--;
            for(int j = rightCol; j>=leftCol && totalElement<r*c;j--){
                System.out.print(arr[buttomrow][j] +" ");
                totalElement++;
            }
            // left -> buttom to top
            buttomrow--;
            for(int i = buttomrow;i>=toprow &&totalElement<r*c; i-- ){
                System.out.print(arr[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;
            
        }
    }
    
}
