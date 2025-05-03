
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

        void insertAtEnd(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                tail= newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        void insertAtStart(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }
        void insertAtIndex(int data, int index){
            Node newNode = new Node(data);
            Node temp = head;
            if(head==null || index==0){
                insertAtStart(data);
            }else{
                if(index>size()){
                    insertAtEnd(data);
                }else{
                    for(int i = 1; i<index-1;i++){
                        temp=temp.next;
                    }
                    newNode.next= temp.next;
                    temp.next= newNode;
                }
            }
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
        System.out.println(lk.size());
        lk.display();
        System.out.println(lk.tail.data);
    }
}
