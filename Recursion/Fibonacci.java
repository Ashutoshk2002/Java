package Recursion;


//{ Driver Code Starts
//Initial Template for Java

/*You are given a number n. You need to find nth Fibonacci number.
F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1

Input:
n = 20
Output:6765
Explanation: The 20th fibonacci 
number is 6765*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking total testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking n as input
            System.out.println(new Solution().fibonacci(n)); // print the nth fibonacci number
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int fibonacci(int n)
    {
         if(n==0 || n==1) return n;
        return fibonacci(n-2)+fibonacci(n-1);
    }
}


