package Recursion;



//{ Driver Code Starts
//Initial Template for Java
// Input:
// n = 5
// Output: 15

import java.util.*;
import java.io.*;
import java.lang.*;

class RecursiveSumNNumber
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Solution().recursiveSum(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    // Complete the function
    // N: input element
    public static int recursiveSum(int n)
    {
        int sum=0;
        if(n==0){
            return sum;
            }
            sum+=n;
        return sum+recursiveSum(n-1);
    }
}
