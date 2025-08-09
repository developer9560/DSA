package loops;
import java.util.*;

public class floyds_triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int num=0;
        for(int i=0; i<n; i++){
            for(int j= 1; j<=i; j++){
                num++;
                System.out.print(num +" ");
            }
            System.out.println();
        }
        
    }
}
