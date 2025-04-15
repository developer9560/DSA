import java.util.Scanner;

public class GDC {
    static int byforloop(int x , int y){
        int smaller = 0; 
        int larger = 0;
        if(x<=y){
            smaller = x;
            larger = y;
        }else{
            smaller = y;
            larger = x;
        }
        for(int i = smaller ;i>0; i--){
            if(smaller%i==0&&larger%i==0){
                return i;
            }
        }
        return 1;
    }
    static int bywhile(int x , int y){
        int rem = 0;
        while (x%y!=0) {
            rem = x%y;
            x=y;
            y=rem;

        }
        return y;
    }

    static int byRecursion(int x , int y ){
        if(y==0){
            return x;
        }
        return byRecursion(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("enter the number of value of y: ");
        int y = sc.nextInt();

        System.out.println(byforloop(x, y));
        System.out.println(bywhile(x, y));
        System.out.println(byRecursion(x, y));
    }
    
}
