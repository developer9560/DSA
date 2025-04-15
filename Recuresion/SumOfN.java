public class SumOfN {
    static void SumofN_number(int n , int num){
       if(num>=n+1){
        return;
       }
       System.out.println(num);
       ++num;
       SumofN_number(n, num);
       
    }
    static void PrintIncreasing(int n){
        if(n==0){
            return;
        }
        PrintIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        // SumofN_number(10 ,1);
        PrintIncreasing(10);
        System.out.println();
        PrintDecreasing(10);

    }
    static void PrintDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.print(n +" ");
        PrintDecreasing(n-1);
    }
}
