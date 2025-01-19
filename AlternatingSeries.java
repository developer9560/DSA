import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=num; i++){
            if(i%2 == 0){
                sum-=i;
            }else{
                sum+=i;
            }
        }
        // int count = 1;
        // while(count<num){
        //     if (count%2 ==0) {
        //         sum-=count;
        //     }else{
        //         sum+=count;
        //     }
        //     count++;
        // }
        System.out.println("total sum is : "+ sum);
        
    }
}
