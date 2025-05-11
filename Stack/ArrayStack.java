public class ArrayStack {
    static class Stack{
        int maxSize;
        int arr[] ;
        int top;
        Stack(int size){
            maxSize= size;
            arr = new int[maxSize];
            top = -1;
        }
        void push(int data){
            if(top==arr.length-1) {
                System.out.println("overflow"); 
                return;
            }
            top++;
            arr[top]= data;
        }
        // void display(Stack st){
        //     while(size>0){
        //         System.out.print(st.arr[top]+" ");
        //         top--;
        //         size--;
        //     }
        // }
        int peek(){
            if(top==-1){
                System.out.println("Underflow");
                return 0;
            }
            return arr[top];
        }

        int pop(){
            if(top==-1){
                System.out.println("Underflow");
                return 0;
            }
            int x = arr[top];
            arr[top]=0;
            top--;
            return x;
        }
        void display(){
        for(int i = 0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(top==arr.length-1){
            return true;
        }
        return false;
    }
    }
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(2);
        st.push(34);
        st.push(43);
        st.push(43);
        st.push(43);
        // st.push(43);
        st.display(); 
        System.out.println(st.isFull());
        // st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
        // st.display();
    }

    

}
