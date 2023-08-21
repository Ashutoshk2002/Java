public class MiddleofLL {
    void printmiddle(Node head){
        if(head==null) return;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}
