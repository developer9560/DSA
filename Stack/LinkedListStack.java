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

        int size(){
            return size;
        }

        void displayrev(Node node){
            if(node==null){
                return;
            }
            displayrev(node.next);
            System.out.print(node.data+" ");
        }

        void display(){
            Node temp = top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        void displayrev(){
            displayrev(top);
            System.out.println();
        }

        int peek(){
            return top.data;
        }
        
        boolean isEmpty(){
            return top==null;
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        // st.pop();
        st.display();
        st.displayrev();
        System.out.println(st.peek());
        System.out.println(st.size());

    }

    

}
