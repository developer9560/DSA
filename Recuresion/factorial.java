public class factorial {
    static void factorialn(int n , int fact){
        if(n ==1){
            System.out.println(fact);
            return;
        }
        fact*=n;
        factorialn(n-1, fact);
       
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        factorialn(5 ,1);
        int ans = fact(10);
        System.out.println(ans);
       
    }
     
}
