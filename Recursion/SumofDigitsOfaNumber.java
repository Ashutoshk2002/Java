package Recursion;


//{ Driver Code Starts
//Initial Template for Java

/*Input:
n = 99999
Output: 45
Explanation: Sum of digit of 99999 is 45. */

import java.util.*;
import java.io.*;
import java.lang.*;

class SumofDigitsOfaNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().sumOfDigits(n)); // computing sum of digits of n
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        int sum=0;
        int last=0;
        if(n==0)
            return sum;
        else if(n==1){
            return 1;
        }
        last=n%10;
        sum+=last;
        return sum+sumOfDigits(n/10);
        
    }
}

