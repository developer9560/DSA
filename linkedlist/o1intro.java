

public class o1intro {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
   static Node createnode(int data){
        Node newnode = new Node(data);
        return newnode;
    }
    static void print(Node head){
        Node temp = head;
        if(temp==null){
            return;
        }
        System.out.println(temp.data);
        print(temp.next);
    }

    public static void main(String[] args){
        createnode(20);
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(20);
        Node n4 = new Node(40);
        n1.next = n2;
        n2.next= n3;
        n3.next= n4;
        Node temp = n1;
        while(temp!=null){
            System.out.print("("+temp.data+")"+" ->");
            temp=temp.next; 

        }
        System.out.println("\nby for loop");
        temp = n1;
        for(int i = 0; i<4; i++){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("\nby recursive");
        temp = n1;
        print(n1);
    }
}
