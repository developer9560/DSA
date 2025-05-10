import java.util.Scanner;
import java.util.Stack;

public class InsertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        Stack<Integer>temp = new Stack<>();
        Scanner sc = new Scanner(System.in);
        st.push(2);
        st.push(6);
        st.push(5);
        System.out.println(st);
        System.out.println("size of stack is :"+st.size());
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        System.out.println("Enter the position or index : ");
        int idx= sc.nextInt();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(data);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
