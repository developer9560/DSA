public class Doublyo1Intro {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data= data;
        }
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    static void displayRev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node Head = new Node(10);
        Node a = new Node(29);
        Node b = new Node(30);
        Node c = new Node(302);
        Node d = new Node(49);
        Head.next = a; a.next =b; b.next=c ; c.next =d ;
        d.prev =c; c.prev =b; b.prev = a; a.prev = Head;
        Head.prev =null;
        d.next=null;
        display(Head);
        displayRev(d);
    }
}
