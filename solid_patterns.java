import java.util.Scanner;

/**
 * solid_patterns
 */
public class solid_patterns {

    public static void main(String[] args) {
       int row , colomn ;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of row : ");
       row = sc.nextInt();
       System.out.print("enter the number of colomn : ");
       colomn = sc.nextInt();
      for(int i= 0; i<row; i++){
        for(int j= 0; j<colomn; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
      }


    }
}