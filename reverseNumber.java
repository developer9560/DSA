import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number");
        int num = sc.nextInt();
        int reverseNum =0;
        int current = 0;
        while(num>0){
            reverseNum = reverseNum*10 +num%10;
            num/=10;
            
        }
        System.out.println(reverseNum);
    }
}
