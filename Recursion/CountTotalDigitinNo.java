package Recursion;

//{ Driver Code Starts
//Initial Template for Java

/*Input:
n  = 99999
Output: 5
Explanation:Number of digit in 99999 is 5 */

import java.util.*;
import java.io.*;
import java.lang.*;

class CountTotalDigitinNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n =sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().countDigits(n)); // prints the count of digits 
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the below function
    public static int countDigits(int n)
    {
        int count = 0;
        // add your code here
        if(n==0)
        return count;
        count++;
        return count+countDigits(n/10);
    }
}

