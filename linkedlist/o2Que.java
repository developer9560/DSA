// implemnt a method to find our th elength of linked List( iterative and recursive);
public class o2Que {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node createNode(int data){
        Node newNode = new Node(data);
        return newNode;
    }
   
    static void display(Node head){
        Node temp = head;
        if(temp==null) return;
        System.out.print(temp.data+" ");
        display(temp.next);
    }
    public static void main(String[] args) {
        Node head = createNode(10);
        Node n2 = createNode(20);
        Node n3 = createNode(40);
        Node n4 = createNode(50);
        Node n5 = createNode(60);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        display(head);
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("total number of node is : "+ count);
    }
}
