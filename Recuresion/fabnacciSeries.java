public class fabnacciSeries {
    static void fabnacci(int fisrt, int second, int n){
        if(n == 0){
            return;
        }
        int sum = fisrt+second;
        System.out.println(sum);
        fisrt=second;
        second= sum;
        fabnacci(fisrt, second, n-1);
    }
    static int fab(int n ){
        //base case;
        if(n==0 || n==1){
            return n;
        }
        return fab(n-1)+fab(n-2);
    }

    public static void main(String[] args) {
        int x = 10;
        int first = 0; 
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i = 1; i<=x; i++){
            int sum = first+second;
            first = second;
            second = sum;
            System.out.println(sum);
        }
        fabnacci(0, 1, x);

        int ans = fab(10);
        System.out.println(ans);
    }
}
