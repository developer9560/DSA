public class recursion_02 {

    public static void printsum(int n ,int sum){
       
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        printsum(n-1,sum);

    }

    public static void main(String[] args) {
        
        printsum(10,0);
    }
}
