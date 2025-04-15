public class SumofDigits {
    static int Sum(int num){
        if(num==0){
            return 0;
        }
        return num%10 + Sum(num/10);
        }
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum += rem;
            num = num/10;
        }
        System.out.println(sum);
        int num1 = 1234;
        System.out.println(Sum(num1));
    }
    
}
