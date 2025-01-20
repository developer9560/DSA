import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value , position, size = 9;
        int arr[]= new int[10];
        for(int i = 0; i<size; i++){
            System.out.println("arr["+ i+"]: ");
            arr[i]= sc.nextInt();

        }
        System.out.println("original array");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("enter the number to inserted");
        value = sc.nextInt();
        System.out.println("enter the position to inserted");
        position = sc.nextInt();
        for(int k = (size-1); k >= position; k--){
            arr[k+1]= arr[k];
        }

        arr[position]= value;
        size++;
        System.out.println(" updated array");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
