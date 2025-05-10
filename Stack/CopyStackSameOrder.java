import java.util.Scanner;
import java.util.Stack;

public class CopyStackSameOrder {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack: ");
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            // System.out.println("Enter the data: ");
            // int num = sc.nextInt();
            st.push(i);
        }
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int num = st.peek();
            rt.push(num);
            st.pop();
        }
        System.out.println(rt);

        Stack<Integer> ct  = new Stack<>();
        while(rt.size()>0){
            ct.push(rt.pop());
        }
        System.out.println("Copy of Stack"+ ct);
        System.out.println(rt);
        
    }
}
