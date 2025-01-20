import java.util.Scanner;


public class binary {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num : ");
        int num = sc.nextInt();
        int binary = 0;
        while(num==0){
            binary = binary*10 + num%2;
            num= num/2;
        }
        System.out.println(binary);
    }
  
    // public static int binaryconverter(int num) {
    //     if (num == 0) {
    //         return 0; // Base case
    //     }
    //     return num % 2 + 10 * binaryconverter(num / 2); // Recursive case
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the value of num : ");
    //     int num = sc.nextInt();
    //     System.out.println("Binary representation of " + num + " is: " + binaryconverter(num));
    // }

}
