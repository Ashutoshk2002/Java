class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class InsetatAnyPos {

    public static Node insertAtpos(Node head, int pos, int data) {
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if(curr==null) return head;

        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(5);// 5
        head.next = new Node(7);// 5 7
        head.next.next = new Node(8);// 5 7 8
        insertAtpos(head, 3, 30);// 5 7 30 8
        insertAtpos(head, 2, 20);// 5 20 7 30 8
        insertAtpos(head, 1, 10);// 10 5 20 7 30 8

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

}
