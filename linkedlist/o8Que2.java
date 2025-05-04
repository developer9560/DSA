
// find the intersection of linkedlist ;

public class o8Que2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node creaatNode(int data) {
        Node node = new Node(data);
        return node;
    }

    static class Linkedlist {
        Node head;
        Node tail;

        void append(int data) {
            Node newNode = creaatNode(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;

            }
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    static int addHelper(Node head, int num) {
    if (head == null) {
        return num;  // Return the fully formed number
    }
    // Shift left by 10 and add current digit
    int newNum = num * 10 + head.data;
    return addHelper(head.next, newNum);
    }
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;       // Extract the last digit
            reversed = reversed * 10 + digit;  // Append it to reversed
            num /= 10;                  // Remove the last digit
        }
        return reversed;
    }

    public static void main(String[] args) {
        Node headA = creaatNode(10);
        Node l = creaatNode(5);
        Node a = creaatNode(20);
        Node b = creaatNode(30);
        Node c = creaatNode(40);
        Node headB = creaatNode(10);
        Node d = creaatNode(90);
        Node e = creaatNode(50);
        Node f = creaatNode(60);
        headA.next = l;
        l.next = a;
        a.next = b;
        b.next = c;
        c.next = e;
        e.next = f;
        headB.next = d;
        d.next = c;
        display(headA);
        display(headB);
        int val = addHelper(headB,0);
        System.out.println(val +"kjdf");
        int num = reverseNumber(1234);
        System.out.println(num+"sus");

    }
}
