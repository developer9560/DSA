public class o10reverseLinkedlinst {
    static class Node{
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

    static void display(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node head = createNode(10);
        Node a = createNode(20);
        Node b = createNode(30);
        Node c = createNode(40);
        Node d = createNode(50);
        head.next= a; a.next=b; b.next=c; c.next=d; 
        display(head);
        Node prevNode= null;
        Node currentNode = head;
        Node agalaNode = head;
        while(currentNode!=null){
            agalaNode=currentNode.next;
            currentNode.next= prevNode;
            prevNode=currentNode;
            currentNode=agalaNode;
        }
        head=prevNode;
        display(head);
         

    }
}
