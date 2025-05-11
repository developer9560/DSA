public class LinkedListStack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        
        Node creatNode(int data){
            Node newNode = new Node(data);
            return newNode;
        }
    }

    static class stack{
        Node top = null;
        int size = 0;

        void push(int data){
            Node temp = new Node(data);
            size++;
            temp.next= top;
            top= temp;
        }

        Node pop(){
            if(top==null){
                System.out.println("underflow");
                return top;
            }
            Node temp = top;
            Node t = top.next;
            temp.next = null;
            top = t;
            size--;
            return temp;
        }

    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        // st.display();

    }

    

}
