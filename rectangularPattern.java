import java.util.Scanner;

public class rectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row , col ;
        System.out.println("Enter number of Rows: ");
        row = sc.nextInt();
        System.out.println("Enter the number of coloum:");
        col = sc.nextInt();
        for(int i = 0 ; i<row; i++){
            for(int j= 0; j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
