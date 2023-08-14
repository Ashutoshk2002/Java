package Recursion;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class CheckPalindrome
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Solution().isPalin(n)?1:0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    static int rev(int n,int temp){
        if(n==0)
        return temp;
        temp=(temp*10)+(n%10);
        return rev(n/10,temp);
    }
    static boolean isPalin(int N)
    {
        int temp=rev(N,0);
        if(temp==N){
            return true;
        }
        else{
            return false;
        }
    }
}