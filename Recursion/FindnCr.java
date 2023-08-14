//{ Driver Code Starts
//Initial Template for Java
package Recursion;



import java.util.*;
import java.io.*;
import java.lang.*;

class FindnCr
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n  =Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);
            
            Get obj = new Get();
            System.out.println(obj.nCr(n, r));
        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Get
{
    public static int nCr(int n,int r)
    {
       //Your code here
     if(r==0 || n==r)
        return 1; 
    
    int a =  nCr(n-1,r-1) + nCr(n-1,r);
    return a;
    }
}