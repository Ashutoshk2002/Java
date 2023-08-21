class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class InsertatBegin {

    static Node insertBegin(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertBegin(head,30);
        head=insertBegin(head,20);
        head=insertBegin(head,10);

        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
