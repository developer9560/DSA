public class o4InserAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    static Node createNode(int data){
        Node newNode = new Node(data);
        return newNode;
    }
   static void insertAtEnd(Node head, int data){
        Node newNode = createNode(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next= newNode;
    }

    static void display(Node head){  
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head =createNode(10);
        insertAtEnd(head, 20);
        insertAtEnd(head, 30);
        display(head);
    }
}
