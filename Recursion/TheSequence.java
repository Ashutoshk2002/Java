package Recursion;

//{ Driver Code Starts
//Initial Template for Java

/*You are given a number n. You need to recursively find the nth term of the series S that is given by:
S(n) = n+ n*(S(n-1)) and S(0) = 1

Input:
n = 2
Output: 6*/
import java.util.*;
import java.io.*;
import java.lang.*;

class TheSequence
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Sequence().theSequence(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// Complete the function given 
class Sequence
{
    // N: input element 
    public static int theSequence(int n)
    {
        if(n==0){
            return 1;
        }
        
        return n+n*theSequence(n-1);
    }

}