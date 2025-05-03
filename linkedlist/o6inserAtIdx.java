public class o6inserAtIdx {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    static Node insertAtIdx(Node head, int data, int idx){
        Node newNode = new Node(data);

        if(head==null){
            head= newNode;
            return newNode;
        }
        Node temp = head;
        for(int i = 0; i<idx-1;i++){
            temp=temp.next;
        }
        newNode.next= temp.next;
        temp.next= newNode;

        return head;
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head = insertAtIdx(head, 20, 1);
        head= insertAtIdx(head, 30, 1);
        head=insertAtIdx(head, 40, 3);
        display(head);
    }
}