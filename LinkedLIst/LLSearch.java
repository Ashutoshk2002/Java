class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LLSearch {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;

        int key=30;
        Node curr=head;
        int pos=1;
        while(curr!=null){
            if(key==curr.data){
                System.out.println("Found at "+pos);
                return;
            }else{
                curr=curr.next;
                pos++;
            }
        }
        
    }
}
