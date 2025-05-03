
public class o5insertAtStart {
    public static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    // static void insertAtStart(Node head, int data){
    //     Node newnode = new Node(data);
    //     if(head==null){
    //         head= newnode;
    //         return;
    //     }
    //     newnode.next = head;
    //     head = newnode; // this logic is correct but java's pass value of reference make copy but not change head in main();
    // }

    static Node insertAtStart(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head = insertAtStart(head, 20);
        head = insertAtStart(head, 30);
        display(head);
    }
}
