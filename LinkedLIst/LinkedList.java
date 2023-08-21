
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class LinkedList{

    public static void printlist(Node head){
        if(head==null) return;
        System.out.println(head.data);
        printlist(head.next);
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;

        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

        //recursive code
        printlist(head);

        
    }
}