
public class o3createLinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size=0;

        Node creatNode(int data){
            Node newNode = new Node(data);
            size++;
            return newNode;
        }

        void insertAtEnd(int data){
            Node newNode = creatNode(data);
            if(head==null){
                head = newNode;
                tail= newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        void insertAtStart(int data){
            Node newNode = creatNode(data);
            if(head==null){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }
        void insertAtIndex(int data, int index){
            Node temp = head;
            if(head==null || index==0){
                insertAtStart(data);
            }else{
                if(index>size()){
                    insertAtEnd(data);
                }else{
                    Node newNode = creatNode(data);
                    for(int i = 0; i<index-1;i++){
                        temp=temp.next;
                    }
                    newNode.next= temp.next;
                    temp.next= newNode;
                }
            }
        }

        void getElementbyVal(int data){
            if(head==null){
                System.out.println("Empty linked list");
                return;
            }
            Node temp = head;
            int count =0;
            while(temp!=null){
                if(temp.data == data){
                    System.out.println("Elemen found at indext : "+count);
                    return;
                }
                temp= temp.next;
                count++;
            }
            System.out.println("Element not found in linkedlist");

        }
        void getElementByIdx(int idx){
            if(head==null){
                System.out.println("Empty linkedlist! ");
                return;
            }
            Node temp = head;
            if(idx>size){
                System.out.println("length of linked list is "+size);
                return;
            }
            for(int i = 0; i<idx;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }

        void deleteAtIndex(int idx){
            Node temp = head;
            if(head==null){
                System.out.println("empty list");
                return;
            }
            if(idx>size){
                System.out.println("length of list is : "+ size +"we cannot delete value of at index"+idx);
                return;
            }else if(idx<0){
                System.out.println("Invalid index");
                return;
            }else if(idx==0){
                head=head.next;
                temp.next=null;
                size--;
                return;
            }
            for(int i = 0; i<idx-1;i++){
                temp=temp.next;
            }
            Node val = temp.next;
            Node nextval = val.next;
            temp.next= nextval;
            val.next=null;
            size--;
        }
        void deleteAtStart(){
            if(head==null){
                System.out.println("Already emplty list! ");
                return;
            }
            Node temp = head;
            head= head.next;
            temp.next=null;
            size--;
        }
        void deleteAtEnd(){
            if(head==null){
                System.out.println("empty list!");
                return;
            }
            Node temp= head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            tail=temp;
            temp.next =null;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp= temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp= temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist lk = new linkedlist();
        lk.insertAtEnd(10);
        lk.insertAtEnd(30);
        lk.insertAtStart(90);
        lk.insertAtStart(100);
        lk.insertAtEnd(50);
        lk.insertAtIndex(1000, 0);
        lk.insertAtIndex(2000, 7);
        lk.insertAtIndex(8000, 4);
        lk.deleteAtIndex(0);
        // lk.deleteAtStart();
        // lk.deleteAtStart();
        // lk.deleteAtEnd();
        // lk.deleteAtIndex(2);
        lk.display();
        System.out.println(lk.tail.data);
    }
}
