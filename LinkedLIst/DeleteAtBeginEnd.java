class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class DeleteAtBeginEnd {


    static Node delfirst(Node head){
        if(head==null) return null;
        else return head.next;
    }

    static Node dellast(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    public static void main(String[] args) {
        // Node head=null;
        Node head=new Node(40);
        head.next=new Node(30);
        head.next.next=new Node(20);
        delfirst(head);
        dellast(head);
        
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
