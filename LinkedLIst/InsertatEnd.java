class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class InsertatEnd {

    static Node insertend(Node head,int x){
        Node temp=new Node(x);
        if(head==null) return temp;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        
        return temp;
    }
    public static void main(String[] args) {
        // Node head=null;
        Node head=new Node(40);
        head.next=insertend(head,30);
        head.next.next=insertend(head,20);
        
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
