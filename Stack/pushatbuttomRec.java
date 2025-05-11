import java.util.Stack;

public class pushatbuttomRec{
    static void pushButtom(Stack<Integer> st, int data){
        if(st.size()==0){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushButtom(st, data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(43);
        st.push(32);
        System.out.println(st);
        pushButtom(st, 0);
        System.out.println(st);
    }
}