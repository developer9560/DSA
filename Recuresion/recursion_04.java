public class recursion_04 {
    public static void fabancci(int a, int b , int n){
        if(n==1){
            return ;
        }
        int c = a+b;
        System.out.println(c);
        fabancci(b, c, n-1);
    }

    public static void main(String[] args) {
        fabancci(0, 1, 20);
    }
}
