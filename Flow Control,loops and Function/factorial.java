//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class factorial {

    
// } Driver Code Ends
//User function Template for Java

public static int nFactorial(int n){
    int ans = 1;
    if(n==0){
        return 1;
    }
    while(n>0){
        ans=ans*n;
        n--;
    }
    
    return ans;
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = nFactorial(n);
            System.out.println(ans);
        }
        scn.close();
    }
}
// } Driver Code Ends