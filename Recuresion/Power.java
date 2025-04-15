public class Power {
    static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int p1 = power(x, n-1);
        int xp = x*p1;
        return xp;
    }
    
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = power(x,n);
        System.out.println(ans);
    }
}
 