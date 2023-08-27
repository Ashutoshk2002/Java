//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class Driver
{
    public static Node insertNode(Node head, int data)
    {
        if(head == null)
            return new Node(data);
            
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
            
        temp.next = new Node(data);
        return head;
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            String str[] = read.readLine().trim().split(" ");
            Node head = null, tail = null;
            head = new Node(Integer.parseInt(str[0]));
            tail = head;
            for(int i = 1; i < n ; i++)
            {
                tail.next = new Node(Integer.parseInt( str[i]));
                tail = tail.next;
            }
                
                
            str = read.readLine().trim().split(" ");
            int pos = Integer.parseInt(str[0]);
            //int data = Integer.parseInt(str[1]);
            makeCircular(head);
            head = new Solution().deleteAtPosition(head, pos);
            displayList(head);
            System.out.println();
        }
    }
    
    public static void displayList(Node head)
    {
        Node temp = head;
        while(temp.next != head)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }
    
    public static void makeCircular(Node head)
    {
        Node temp = head;
        
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head;
    }
    
    
}
// } Driver Code Ends


//User function Template for Java



/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution
{
    public static Node deleteAtPosition(Node head, int pos)
    {
        if(pos==1){
            head.data=head.next.data;
            head.next=head.next.next;
            return head;
        }
        
         int p=1;
         Node temp=head;
         Node cur=head.next;
         while(p<=pos-2&&cur!=head){
             cur=cur.next;
             temp=temp.next;
             p++;
         }
         if(cur==head)
            return head;
        else{
            temp.next=temp.next.next;
            
        }
        
        return head;
    }
}