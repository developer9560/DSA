import java.util.Stack;

public class displayStack {
    static void displayRevStack(Stack<Integer>st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRevStack(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<=10; i+=2){
            st.push(i);
        }

        System.out.println(st);
        //print without above line , inbuilt function
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }

        while(temp.size()>0){
            System.out.print(temp.peek()+", ");
            st.push(temp.pop());
        }

        System.out.println();
        displayRevStack(st);
        // System.out.println(st);
    }
}
