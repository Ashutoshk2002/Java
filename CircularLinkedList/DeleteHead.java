

//User function Template for Java


class Solution
{
    public static Node deleteHead(Node head)
    {
         // your code here
        if(head==null)return null;
        if(head.next==null)return null;
        Node curr=head;
        while(curr.next!=head)
            curr=curr.next;
            curr.next=head.next;
            head.next=null;
        return curr.next;
    }
}