// find the nth node from end or last;

public class o7que1 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // method 1
    static Node nthNode(Node head, int n) {
        if (head == null) {
            System.out.println("Linkedlist is empety!");
            return head;
        }
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1; 
        temp = head;
        for (int i = 0; i < m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // method 2 , two pointers

    static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    // delete nth term from last ;
    static Node deleteNode(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        Node val = nthNode(head, 2);
        System.out.println(val.data);
        Node val2 = nthNode2(head, 1);
        System.out.println(val2.data);
        head= deleteNode(head, 5);
        display(head);
    }

}
