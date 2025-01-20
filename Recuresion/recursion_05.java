public class recursion_05 {
    public static int power(int x , int n){
        // int mlt = 1;
        // for(int i =0 ; i<n; i++){
        //     mlt = mlt *x;
        // }
        // System.out.println(mlt);
        if (x==0) {
            return 1;
        }
        if(n==0){
            return 1;
        }
        int p1 = power(x, n-1);
        int xp = x*p1;
        return xp;
    }

    public static void main (String[] args){
        // power(2,5 ); // for void funtion for loop using 
        int ans = power(2, 2);
        System.out.println(ans);
    }
}
