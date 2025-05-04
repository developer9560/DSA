public class DisplayLinkedlist {
    public class Node{
        int data;
        int next;
    }
    public void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
        }
    }
}
