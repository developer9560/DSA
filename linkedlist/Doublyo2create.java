public class Doublyo2create {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    static class DDL{
        Node head = null;
        Node tail = null;
        int size = 0;
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayRev(){
            Node temp = tail;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.prev;
            }
            System.out.println();
        }
        void getHead(){
            System.out.print(head.data+"\n");
        }
        void getHeadbyNode(Node node){
            Node temp = node;
            while(temp.prev!=null){
                temp = temp.prev;
            }
            System.out.println(temp.data);
        }
        void getTail(){
            System.out.println(tail.data+"\n");
        }
        void getTailbyAnyNode(Node node){
            Node temp = node;
            while(temp.next!=null){
                temp= temp.next;
            }
            System.out.println(temp.data);
        }
        Node creatNode(int data){
            Node newNode = new Node(data);
            size++;
            return newNode;
        }
        

        void insertAtStart(int data){
            Node newNode = new Node(data);
            if(head==null){
                head= newNode;
                tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev= newNode;
            head= newNode;
        }

        void insertAtEnd(int data){
            Node newNode = creatNode(data);
            if(head==null){
                head= newNode;
                tail=newNode;
                return;
            }
            tail.next=newNode;
            newNode.prev=tail;
            tail= newNode;
        }

        void insertAtIndex(int data, int idx){
            Node newNode = creatNode(data);
            if(head==null || idx == 0){
                insertAtStart(data);
                return;
            }
            Node temp = head;
            for(int i = 0; i<idx-1; i++){
                temp= temp.next;
            }
            Node a = temp.next;
            temp.next=newNode;
            newNode.next = a;
            a.prev= newNode;
            newNode.prev= temp;
        }

        void deleteAtStart(){
            if(head==null){
                System.out.println("Linked list empty!");
                return;
            }
            Node temp = head.next;
            head.next= null;
            temp.prev=null;
            head= temp;
        }
        void deleteAtEnd(){
            if(head==null || tail==null){
                System.out.println("empty list");
                return;
            }
            tail = tail.prev;
            tail.next = null;
        }
        void deleteAtIndex(){
            
        }
    }
    public static void main(String[] args) {
        DDL l = new DDL();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtStart(80);
        l.insertAtIndex(100, 1);
        l.deleteAtStart();
        l.getTail();
        l.deleteAtEnd();
        l.getHead();
        l.display();
        l.displayRev();
        l.getTail();
        
    }

}
